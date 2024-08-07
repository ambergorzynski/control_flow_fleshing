package testing;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.reflect.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class Path {
	String inputFilename;
	int dir[];
	int actualOutput[];
	int expectedOutput[];
	int outputSize;

	Path(String inputFilename) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ParseException {
		this.inputFilename = inputFilename;

		// get direction size and expected output size from file
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(inputFilename));

		JSONArray jsonDir = (JSONArray) jsonObject.get("dirs");
		JSONArray jsonOutput = (JSONArray) jsonObject.get("expected_output");

		outputSize = jsonOutput.size();
		int dirSize = jsonDir.size();

		// create arrays
		dir = new int[dirSize];
		actualOutput = new int[2*outputSize];
		expectedOutput = new int[outputSize];

		// fill arrays
		int counter = 0;
		for (Object o : jsonDir) {
			dir[counter] = (int) (long) o;
			counter++;
		}	
		counter = 0;
		for (Object o : jsonOutput) {
			expectedOutput[counter] = (int) (long) o;
			counter++;
		}
		for (int i = outputSize; i < 2*outputSize; i++) {
			actualOutput[i] = -1;
		}
	}

	boolean compare() {
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

	void recordOutput(String fileName, boolean result) {
		if (fileName == null) {
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

			System.out.print("\nActual output:  ");

			for(int i = 0; i < 2*outputSize; i++){
				System.out.print(" " + actualOutput[i]);
			}

			System.out.print("\n");
			return;
		}

		try{
			FileWriter fw = new FileWriter(fileName, true);

			fw.write("Test name: " + inputFilename + "\n");

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
} 

class Wrapper{

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ParseException {

		// parse args
		String className = args[0];
		String inputFilenames[] = args[1].split(":");
		String outputFilename = args[2];
		String badOutputFilename = args[3];
		int nFunctionRepeats = Integer.parseInt(args[4]);

		Path paths[] = new Path[inputFilenames.length];

		for (int i = 0; i < inputFilenames.length; i++) {
			paths[i] = new Path(inputFilenames[i]);
		}

		boolean result = true;
		boolean success = true;

		// create class
		Constructor<?> constructor = Class.forName(className).getConstructor();
	
		TestCaseInterface test = (TestCaseInterface) constructor.newInstance();

		// repeat function to induce JIT
		for(int i = 0; i < nFunctionRepeats; i++){

			test.testCase(paths[0].dir, paths[0].actualOutput);

			// compare each expected and actual and write out if any are inconsistent
			result = paths[0].compare();
			success = success && result;

			// record bad output in separate file
			if (!result){
				paths[0].recordOutput(badOutputFilename, result);
			}
		}

		// if multiple paths provided, change the path to trigger deoptimization
		if (paths.length >= 2) {
			System.out.println("Switching paths");

			// repeat function to induce JIT
			for(int i = 0; i < nFunctionRepeats; i++){

				test.testCase(paths[1].dir, paths[1].actualOutput);

				// compare each expected and actual and write out if any are inconsistent
				result = paths[1].compare();
				success = success && result;

				// record bad output in separate file
				if (!result){
					paths[1].recordOutput(badOutputFilename, result);
				}

			}

			// compare final expected and actual
			result = paths[0].compare();
			success = success && result;

			// record all output
			paths[0].recordOutput(outputFilename, result);

			// record bad output in separate file
			if (!result){
				paths[0].recordOutput(badOutputFilename, result);
			}

			// print outcomes
			paths[0].recordOutput(null, result);

			// compare each expected and actual and write out if any are inconsistent
			result = paths[1].compare();
			success = success && result;

			// record all output
			paths[1].recordOutput(outputFilename, result);

			// record bad output in separate file
			if (!result){
				paths[1].recordOutput(badOutputFilename, result);
			}

			// print outcomes
			paths[1].recordOutput(null, result);
		} else {
			// compare final expected and actual
			result = paths[0].compare();
			success = success && result;

			// record all output
			paths[0].recordOutput(outputFilename, result);

			// record bad output in separate file
			if (!result){
				paths[0].recordOutput(badOutputFilename, result);
			}

			// print outcomes
			paths[0].recordOutput(null, result);
		}

		if(success) {
			System.exit(0);
		}

		System.exit(1);
	}

}
