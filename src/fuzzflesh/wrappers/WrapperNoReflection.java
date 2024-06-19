import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.reflect.*;

class Wrapper{

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

		// parse args
		String inputFilename = args[0];
		String outputFilename = args[1];
		String badOutputFilename = args[2];
		int nFunctionRepeats = Integer.parseInt(args[3]);

		boolean result = true;

		// get direction size and expected output size from file
		Scanner reader = new Scanner(new File(inputFilename));

		int dirSize = Integer.parseInt(reader.nextLine());
		int outputSize = Integer.parseInt(reader.nextLine());

		// create arrays
		int[] dir = new int[dirSize];
		int[] actualOutput = new int[2*outputSize];
		int[] expectedOutput = new int[outputSize];

		// fill arrays
		setupArrays(dirSize, outputSize, dir, actualOutput, expectedOutput, reader);

		// create class
        TestCase test = new TestCase();

		// repeat function to induce JIT
		for(int i = 0; i < nFunctionRepeats; i++){

			test.testCase(dir, actualOutput);

			// compare each expected and actual and write out if any are inconsistent
			result = compare(expectedOutput, actualOutput, outputSize);

			// record bad output in separate file
			if (!result){
				recordOutput(badOutputFilename, inputFilename, result, expectedOutput, actualOutput, outputSize);
			}

		}

		// compare final expected and actual
		result = compare(expectedOutput, actualOutput, outputSize);

		// record all output
		recordOutput(outputFilename, inputFilename, result, expectedOutput, actualOutput, outputSize);

		// record bad output in separate file
		if (!result){
			recordOutput(badOutputFilename, inputFilename, result, expectedOutput, actualOutput, outputSize);
		}

		// print outcomes
		System.out.print("Expected and actual output are");

		if(result) {
			System.out.print("");
		}
		else {
			System.out.print(" not");
		}

		System.out.print(" the same\n");

		System.out.print("Expected output:");
		
		for(int i = 0; i < outputSize; i++){
			System.out.print(" " + expectedOutput[i]);
		}

		System.out.print("\n");


		System.out.print("Actual output:  ");
		
		for(int i = 0; i < 2*outputSize; i++){
			System.out.print(" " + actualOutput[i]);
		}

		System.out.print("\n");


	}

	private static void recordOutput(String fileName, String testName, boolean result, int[] expectedOutput, int[] actualOutput, int outputSize){

		try{
			FileWriter fw = new FileWriter(fileName, true);

			fw.write("Test name: " + testName + "\n");

			fw.write("Expected and actual output are");

			if(result) {
				fw.write("");
			}
			else {
				fw.write(" not");
			}

			fw.write(" the same\n");

			fw.write("Expected output:");
			
			for(int i = 0; i < outputSize; i++){
				fw.write(" " + expectedOutput[i]);
			}

			fw.write("\n");


			fw.write("Actual output:  ");
			
			for(int i = 0; i < 2*outputSize; i++){
				fw.write(" " + actualOutput[i]);
			}

			fw.write("\n");

			fw.close();

		}catch(IOException e){
			System.out.println("Error writing results to file");
		}

	}

	private static void setupArrays(int dirSize, int outputSize, int[] dir, int[] actualOutput, int[] expectedOutput, Scanner reader){
	
		// initialise to -1
		for(int i = 0; i < 2*outputSize; i++){
			actualOutput[i] = -1;
		}
		
		// fill arrays
		for(int i = 0; i < dirSize; i++){
			dir[i] = reader.nextInt();
		}
		
		for(int i = 0; i < outputSize; i++){
			expectedOutput[i] = reader.nextInt();
		}

	}

	private static boolean compare(int[] expectedOutput, int[] actualOutput, int outputSize){

		// check actual and expected path are the same
		for(int i = 0; i < outputSize; i++){
			if(expectedOutput[i] != actualOutput[i]){
				return false;
			}
		}

		// check no overflow occurred
		for(int i = outputSize; i < 2*outputSize; i++){
			if(actualOutput[i] != -1){
				return false;
			}
		}

		return true;
	}


}
