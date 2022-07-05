package Training;

import java.util.Scanner;

public class ArrayPractice {
	static Scanner input = new Scanner(System.in);

	public static void addOddPositionNumber() {
		int sum = 0;
		System.out.print("Enter the total number of inputs\t:");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the number " + (i + 1));
			arr[i] = input.nextInt();
		}
		for (int j = 1; j < size; j = j + 2) {
			sum = sum + arr[j];

		}
		System.out.println("the sum of odd position of array\t:" + sum);
	}

	public static void findGivenNumber() {
		System.out.print("Enter the total number of inputs\t:");
		int count = 0;
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the number " + (i + 1));
			arr[i] = input.nextInt();
		}
		System.out.println("enter the number to find position");
		int num = input.nextInt();
		for (int j = 0; j < size; j++) {
			if (arr[j] == num) {
				count++;
				System.out.println("the position of given number is " + j);
			}
		}
		if (count == 0) {
			System.out.println("the given number not found in the array ");
		} else {
			System.out.println("The occurance of given number :" + count);
		}

	}

	public static void replaceNumber() {
		System.out.print("Enter the total number of inputs\t:");
		boolean result = true;
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter the number " + (i + 1));
			arr[i] = input.nextInt();
		}
		System.out.println("enter the number to replace");
		int num = input.nextInt();
		System.out.println("enter the new number");
		int replace = input.nextInt();
		for (int j = 0; j < size; j++) {
			if (arr[j] == num) {
				arr[j] = replace;
				System.out.println(num + " replaced with " + replace);
				result = false;
			}
		}
		if (result) {
			System.out.println("the given number is not found in the array");
		}
	}

	public static void printReverse() {
		System.out.print("Enter the total number of inputs\t:");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("enter the number " + (i + 1) + ":\t");
			arr[i] = input.nextInt();
		}
		System.out.print("the given array is = {");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("}");
		System.out.print("the reversed array is = {");
		for (int i = size; i > 0; i--) {
			System.out.print(arr[i - 1] + " ");
		}
		System.out.println("}");

	}

	public static void main(String[] args) {
		addOddPositionNumber();
		findGivenNumber();
		replaceNumber();
		printReverse();
	}
}
