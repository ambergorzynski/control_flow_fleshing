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

class Wrapper{

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ParseException {

		// parse args
		String className = args[0];
		String inputFilename = args[1];
		String outputFilename = args[2];
		String badOutputFilename = args[3];
		int nFunctionRepeats = Integer.parseInt(args[4]);

		// get direction size and expected output size from file
        JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(inputFilename));

        JSONArray jsonDir = (JSONArray) jsonObject.get("dirs");
        JSONArray jsonOutput = (JSONArray) jsonObject.get("expected_output");

        int outputSize = jsonOutput.size();
        int dirSize = jsonDir.size();

		// create arrays
		int[] dir = new int[dirSize];
		int[] actualOutput = new int[2*outputSize];
		int[] expectedOutput = new int[outputSize];

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

		// create class
		Constructor<?> constructor = Class.forName(className).getConstructor();
	
		TestCaseInterface test = (TestCaseInterface) constructor.newInstance();

		// repeat function to induce JIT
		for(int i = 0; i < nFunctionRepeats; i++){
			test.testCase(dir, actualOutput);
		}

		// compare expected and actual
		boolean result = compare(expectedOutput, actualOutput, outputSize);

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

		if(result) {
			System.exit(0);
		}

		System.exit(1);

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
