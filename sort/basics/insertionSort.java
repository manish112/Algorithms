package in.manishsingh.techpost.sorting;

import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements need to be sorted: ");
		int input_size = Integer.parseInt(in.nextLine());

		int[] numArray = new int[input_size];

		int counter = 0;

		while (counter != input_size) {
			System.out.print("\nEnter the number for position " + (counter + 1) + ": ");
			numArray[counter] = Integer.parseInt(in.nextLine());
			counter++;
		}
		
		in.close();

		insertionSortexecute(numArray, input_size);
		printSortedArray(numArray, input_size);
		printComplexity(input_size);

	}

	static void insertionSortexecute(int[] numArray, int size) {

		int tmpNum = 0;

		for (int i = 1; i < size; i++) {
			for (int j = i; j >0; j--) {
				if (numArray[j] < numArray[j-1]) {
					tmpNum = numArray[j-1];
					numArray[j-1] = numArray[j];
					numArray[j] = tmpNum;
				}
			}
		}

	}

	static void printSortedArray(int[] numArray, int size) {

		System.out.print("\n\nThe sorted array is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(numArray[i] + " ");
		}

	}
	
	static void printComplexity(int size) {
		
		System.out.println("\n\n\nTime complexity of this algorithm is:\n");
		System.out.println("Best case: "+size);
		System.out.println("Avergae case: "+(size*size));
		System.out.println("Worst case: "+(size*size));
		System.out.println("\n\nSpace complexity of this algorithm is: 1");
		
	}

}
