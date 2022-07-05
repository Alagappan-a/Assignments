package Training;

import java.util.Scanner;

public class Matrix {
	static Scanner input = new Scanner(System.in);

	public static void matrixAddition() {
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
		if (firstMatrixRow == secondMatrixRow && firstMatrixColumn == secondMatrixColumn) {
			int[][] result = new int [firstMatrixRow][firstMatrixColumn];
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
			System.out.print("the addition of given two array is :\n");
			for (int i = 0; i < secondMatrixRow; i++) {
				for (int j = 0; j < secondMatrixColumn; j++) {
					result[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
			

		}
		else
			System.out.println("For adding two matrix the size of the two matrix should be 'equal'.");
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
		if (firstMatrixColumn == secondMatrixRow ) {
			int[][] result = new int [firstMatrixRow][secondMatrixColumn];
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
					for(int k=0;k<secondMatrixRow;k++)
					result[i][j]+=(firstMatrix[i][k]*secondMatrix[k][j]);
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
		}
			
		}
		else
			System.out.println("For multiply two different matrix the column of first matrix should be equal to the row of the second matrix");
	}
	public static void main(String[] args) {
//		matrixAddition();
		matrixMultipication();
		
	}
}
