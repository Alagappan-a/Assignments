package org.ZohoSchoolGraduateTraining;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	static Scanner input = new Scanner(System.in);

	public static void findGrandChild() {
		int grandChild = 0;
		String childName;
		System.out.print("Enter the number of rows\t:");
		int rowSize = input.nextInt();
		System.out.print("Enter the number of column\t:");
		int columnSize = input.nextInt();
		String[][] matrix = new String[rowSize][columnSize];
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				if (j == 0)
					System.out.print("Enter the child name " + (i + 1) + " :");
				if (j == 1)
					System.out.print("Enter the parent name " + (i + 1) + " :");
				matrix[i][j] = input.next();
			}
		}
		System.out.println("Enter the name to find their grand child count:");
		String name = input.next();

		for (int i = 0; i < rowSize; i++) {
			if (name.equals(matrix[i][1])) {
				childName = matrix[i][0];
				for (int j = 0; j < rowSize; j++) {
					if (childName.equals(matrix[j][1])) {
						grandChild++;
					}
				}
			}
		}
		System.out.println(name + " has " + grandChild + " grandchildren");
	}

	public static void findWeightage() {
		System.out.print("Enter the number of values\t:");
		int numberOfInput = input.nextInt();
		int[] value = new int[numberOfInput];
		for(int i=0;i<numberOfInput;i++) {
			System.out.println("Enter the value for "+i+" index:");
			value[i]=input.nextInt();
		}
		int[] weightage=new int[numberOfInput];

			for (int i = 0; i < numberOfInput; i++) {
				int sum = 0;
				for (int j = 1; j * j <= (value[i]); j++) {
					if (j * j == value[i]) {
						sum = sum + 5;
						break;
					}
				}
				if (value[i] % 4 == 0 && value[i] % 6 == 0) {
					sum = sum + 4;
				}
				if (value[i] % 2 == 0) {
					sum = sum + 3;
				}
				weightage[i]=sum;
			}
			int index=0;
			for (int i=0;i<numberOfInput ;i++ )
			{
				int temp=0;
				for (int j=0;j<numberOfInput ;j++ )
				{
					if (temp<=weightage[j])
					{
						temp=weightage[j];
						index=j;
					}
				}
				System.out.print("< "+value[index]+" , "+weightage[index]+" > ");
				weightage[index]=0;
			}

	}

	public static void printPattern() {
		System.out.println("Enter the word: ");
		String word = input.next();
		int length = word.length();
		char givenWord[] = new char[length];
		givenWord = word.toCharArray();
		if (length % 2 == 0)
			System.out.println("0");
		else {

			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {
					if (i == j) {
						System.out.print(givenWord[i]);
					}

					else if (i + j == (length - 1)) {
						System.out.print(givenWord[j]);
					} else {
						System.out.print(" ");
					}

				}
				System.out.println();
			}
		}
	}

	public static void matrixMultipication() {
		System.out.print("Enter the number of rows for matrix-1\t:");
		int firstMatrixRow = input.nextInt();

		System.out.print("Enter the number of column for matrix-1\t:");
		int firstMatrixColumn = input.nextInt();

		System.out.print("Enter the number of rows for matrix-2\t:");
		int secondMatrixRow = input.nextInt();

		System.out.print("Enter the number of column for matrix-2\t:");
		int secondMatrixColumn = input.nextInt();

		int[][] firstMatrix = new int[firstMatrixRow][firstMatrixColumn];

		int[][] secondMatrix = new int[secondMatrixRow][secondMatrixColumn];

		if (firstMatrixColumn == secondMatrixRow) {
			int[][] result = new int[firstMatrixRow][secondMatrixColumn];
			System.out.println("Enter the value for first array");
			for (int i = 0; i < firstMatrixRow; i++) {
				for (int j = 0; j < firstMatrixColumn; j++) {
					System.out.print("Enter the value for row :" + (i + 1) + " column :" + (j + 1) + " :");
					firstMatrix[i][j] = input.nextInt();
				}
			}
			System.out.print("the given array is :\n");
			for (int i = 0; i < firstMatrixRow; i++) {
				for (int j = 0; j < firstMatrixColumn; j++) {
					System.out.print(firstMatrix[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Enter the value for second array");
			for (int i = 0; i < secondMatrixRow; i++) {
				for (int j = 0; j < secondMatrixColumn; j++) {
					System.out.print("Enter the value for row :" + (i + 1) + " column :" + (j + 1) + " :");
					secondMatrix[i][j] = input.nextInt();
				}
			}
			System.out.print("the given array is :\n");
			for (int i = 0; i < secondMatrixRow; i++) {
				for (int j = 0; j < secondMatrixColumn; j++) {
					System.out.print(secondMatrix[i][j] + " ");
				}
				System.out.println();
			}
			System.out.print("the multipication of given two array is :\n");
			for (int i = 0; i < firstMatrixRow; i++) {
				for (int j = 0; j < secondMatrixColumn; j++) {
					for (int k = 0; k < secondMatrixRow; k++)
						result[i][j] += (firstMatrix[i][k] * secondMatrix[k][j]);
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}

		} else
			System.out.println(
					"For multiply two different matrix the column of first matrix should be equal to the row of the second matrix");
	}

	public static void arrangeTheArray() {
		System.out.println("Enter the number of elements:");
		int num = input.nextInt();
		int input1[] = new int[num];
		int result[] = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the value for " + i + " index :");
			input1[i] = input.nextInt();
		}
		Arrays.sort(input1);
		int oddPosition, evenPosition;
		if (num % 2 == 0) {
			oddPosition = num / 2 - 1;
			evenPosition = num / 2;
		} else {
			oddPosition = num / 2;
			evenPosition = num - oddPosition;

		}
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				result[i] = input1[oddPosition];
				--oddPosition;
			} else {
				result[i] = input1[evenPosition];
				++evenPosition;
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.print(result[i]);
		}

	}

	public static void main(String[] args) {
		findGrandChild();
		matrixMultipication();
		printPattern();
		arrangeTheArray();
		findWeightage();
		
	}
}
