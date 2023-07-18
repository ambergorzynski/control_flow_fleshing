package testing;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.reflect.*;

class Wrapper{

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

		// parse arg for class name
		String className = args[0];
		String filename = args[1];

		// get direction size and expected output size from file
		Scanner reader = new Scanner(new File(filename));

		int dirSize = Integer.parseInt(reader.nextLine());
		int outputSize = Integer.parseInt(reader.nextLine());

		// create arrays
		int[] dir = new int[dirSize];
		int[] actualOutput = new int[2*outputSize];
		int[] expectedOutput = new int[outputSize];

		// fill arrays
		setupArrays(dirSize, outputSize, dir, actualOutput, expectedOutput, reader);

		// create class
		//SwitchTest test = new SwitchTest();
		//TestInterface test = new TestCase();
		//Constructor<?> constructor = Class.forName(className).getConstructor();
		Constructor<?> constructor = Class.forName(className).getConstructor();
	
		TestCaseInterface test = (TestCaseInterface) constructor.newInstance();

		test.testCase(dir, actualOutput);

		// compare expected and actual
		boolean result = compare(expectedOutput, actualOutput, outputSize);

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
