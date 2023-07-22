using System;
using System.Linq;
using System.Reflection;
using System.IO;

class Wrapper
{
		static void Main(string[] args)
		{
			int[] dir = null;
			int[] expectedOutput = null;
			int[] actualOutput = null;
			int dirSize = 0;
			int outSize = 0;

			// parse args
			string className = args[0];
			string inputFilename = args[1];
			string outputName = args[2];
			string badOutputName = args[3];
			string fullPath = args[4];

			readIn(inputFilename, ref dirSize, ref outSize, ref dir, ref expectedOutput, ref actualOutput);
			
			// load test case class dynamically from assembly

			Assembly externalAssembly = Assembly.LoadFile(@"/Users/ambergorzynski/Documents/cfg/repo/control_flow_fleshing/fuzzing/cil/fuzzing_220723/proj/testing/"+className+".exe");

			Type[] assemblyTypes = externalAssembly.GetTypes();

			Type targetType = assemblyTypes.FirstOrDefault(t => t.Name==className);
			
			Console.WriteLine(targetType);
			
			if(targetType != null)
			{
				object targetInstance = Activator.CreateInstance(targetType);
				
				// get the callTest method
				MethodInfo callTestMethod = targetType.GetMethod("callTest");

				// invoke method dynamically
				callTestMethod.Invoke(targetInstance, new object[] {dir, actualOutput});

			}
			else
			{
				Console.WriteLine("Error loading target test case");
			}

			// compare actual and expected output
			bool result = cmp(expectedOutput, actualOutput);

			// write all output to file
			writeOutput(outputName, className, result, expectedOutput, actualOutput);

			// write bad outputs to separate file
			if(!result)
			{
				writeOutput(badOutputName, className, result, expectedOutput, actualOutput);
			}

			// write outputs to console
			writeOutputToScreen(result, expectedOutput, actualOutput);


		}

		public static void writeOutputToScreen(bool result, int[] expectedOutput, int[] actualOutput)
		{
				
			if(result)
				{
					Console.WriteLine("Expected output and actual output are the same");
				}
			else
				{
					Console.WriteLine("Expected output and acutal output are not the same");
				}
				
			Console.Write("Expected output:");
				
			foreach(int i in expectedOutput)
				{
					Console.Write(" ");
					Console.Write(i);
				}

			Console.Write("\n");

			Console.Write("Actual output:  ");

			foreach(int i in actualOutput)
				{
					Console.Write(" ");
					Console.Write(i);
				}

			Console.Write("\n");
		}

			

		public static void writeOutput(string outputName, string className, bool result, int[] expectedOutput, int[] actualOutput)
		{
			using(StreamWriter sw = File.AppendText(outputName))
			{
				sw.WriteLine(className);
				
				if(result)
				{
					sw.WriteLine("Expected output and actual output are the same");
				}
				else
				{
					sw.WriteLine("Expected output and acutal output are not the same");
				}
				
				sw.Write("Expected output:");
				
				foreach(int i in expectedOutput)
				{
					sw.Write(" ");
					sw.Write(i);
				}

				sw.Write("\n");

				sw.Write("Actual output: ");

				foreach(int i in actualOutput)
				{
					sw.Write(" ");
					sw.Write(i);
				}

				sw.Write("\n");
			}
		}
			
		public static void readIn(string filename, ref int dirSize, ref int outSize, ref int[] dir, ref int[] expectedOutput, ref int[] actualOutput)
		{
			// read in directions from text file
			string[] lines = File.ReadAllLines(filename);

			// lines are sizes
			dirSize = Int32.Parse(lines[0]);
			outSize = Int32.Parse(lines[1]);

			// lines are space-separated arrays
			dir = Array.ConvertAll(lines[2].Split(' '), int.Parse);
			expectedOutput = Array.ConvertAll(lines[3].Split(' '), int.Parse);
			actualOutput = new int[2*outSize];

			for(int i = 0; i < 2*outSize; i++)
			{
				actualOutput[i] = -1;
			}
		}

		public static bool cmp(int[] expectedOutput, int[] actualOutput)
		{
			int len = expectedOutput.Length;

			for(int i = 0; i < len; i++)
			{
				if(expectedOutput[i] != actualOutput[i])
				{
					return false;
				}
			}

			for(int i = len; i < 2*len; i++)
			{
				if(actualOutput[i] != -1)
				{
					return false;
				}
			}

			return true;
		}


}

