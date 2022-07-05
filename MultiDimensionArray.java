package Training;

import java.util.Scanner;

public class MultiDimensionArray {
	static Scanner input = new Scanner(System.in);

	public static void userMatrix() {
		System.out.print("Enter the number of rows\t:");
		int rowSize = input.nextInt();
		System.out.print("Enter the number of column\t:");
		int columnSize = input.nextInt();
		int[][] matrix = new int[rowSize][columnSize];
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				System.out.print("Enter the value for row :" + (i + 1) + " column :" + (j + 1) + " :");
				matrix[i][j] = input.nextInt();
			}
		}
		System.out.print("the given array is :\n");
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void squareMatrix() {
		System.out.print("Enter the size of matrix\t:");
		int matrixSize = input.nextInt();
		int[][] matrix = new int[matrixSize][matrixSize];
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				System.out.print("Enter the value for row :" + (i + 1) + " column :" + (j + 1) + " :");
				matrix[i][j] = input.nextInt();
			}
		}
		System.out.print("the given array is :\n");
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void findPosition() {
		System.out.print("Enter the size of matrix\t:");
		int matrixSize = input.nextInt();
		int count = 0;
		int[][] matrix = new int[matrixSize][matrixSize];

		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				System.out.print("Enter the value for row :" + (i + 1) + " column :" + (j + 1) + " :");
				matrix[i][j] = input.nextInt();
			}
		}
		System.out.print("the given array is :\n");
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("Enter the number to find position\t:");
		int number = input.nextInt();

		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				if (number == matrix[i][j]) {
					count++;
					if (count == 1) {
						System.out.println("the position of given number :");
					}
					System.out.println("row :" + i + 1 + " column :" + j + 1);
				}
			}
		}
		if (count == 0)
			System.out.println("the given number not found in the array");
	}

	public static void main(String[] args) {
		userMatrix();
		squareMatrix();
		findPosition();
	}

}
