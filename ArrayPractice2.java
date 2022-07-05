package Training;

import java.util.Scanner;

public class ArrayPractice2 {
	static Scanner input = new Scanner(System.in);

	public static void withoutDuplicateInput() {
		System.out.print("Enter the total number of inputs\t:");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("enter the number " + (i + 1) + "\t:");
			arr[i] = input.nextInt();
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						System.out.println("Entered number already exists ,enter another number");
						i--;
						break;
					}
			}
		}
		System.out.print("the given array is = {");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("}");

	}

	public static void incrementalOrder() {
		System.out.print("Enter the total number of inputs\t:");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("enter the number " + (i + 1) + "\t:");
			arr[i] = input.nextInt();
				for (int j = 0; j < i; j++) {
					if (arr[i] < arr[j]) {
						System.out.println("Entered number must be greater than " + arr[i - 1]);
						i--;
						break;
					}
				}
			}
		System.out.print("the given array is = {");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("}");
	}

	public static void splitArray() {
		System.out.print("Enter the total number of inputs\t:");
		int size = input.nextInt();
		int[] arr = new int[size];
		int oddSize = 0, evenSize = 0, j = 0, k = 0;

		for (int i = 0; i < size; i++) {
			System.out.print("enter the number " + (i + 1) + "\t:");
			arr[i] = input.nextInt();
			if (arr[i] % 2 == 0) {
				evenSize++;
			}
		}
		oddSize = size - evenSize;
		int[] even = new int[evenSize];
		int[] odd = new int[oddSize];
		System.out.print("the given array is = {");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("}");

//		to allot odd number in new array		
		for (int i = 0; i < oddSize; i++) {
			for (j = j; j < size; j++) {

				if (arr[j] % 2 != 0) {
					odd[i] = arr[j];
					j++;
					break;
				}
			}
		}
		System.out.print("the odd number array is = {");
		for (int i = 0; i < oddSize; i++) {
			System.out.print(odd[i] + " ");
		}
		System.out.println("}");
//		to allot even numbers in new array
		for (int i = 0; i < evenSize; i++) {

			for (k = k; k < size; k++) {
				if (arr[k] % 2 == 0) {
					even[i] = arr[k];
					k++;
					break;
				}
			}
		}
		System.out.print("the even array is = {");
		for (int i = 0; i < evenSize; i++) {
			System.out.print(even[i] + " ");
		}
		System.out.println("}");

	}

	public static void main(String[] args) {
		withoutDuplicateInput();
//		incrementalOrder();
//		splitArray();

	}
}
