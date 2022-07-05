package Training;

import java.util.Scanner;

public class ArrayTask {
	static Scanner input = new Scanner(System.in);

	public static void sortArray() {
		System.out.print("Enter the total number of inputs\t:");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("enter the number " + (i + 1) + "\t:");
			arr[i] = input.nextInt();
		}
		System.out.print("the given array is = {");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("}");
		for (int i = 0; i < size; i++) {
			for (int j = (i + 1); j < size; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print(
				"For ascending the given array enter :'A'\n For descending the given array enter :'D' \n enter your option:");
		char choice = input.next().charAt(0);
		if (choice == 'A') {
			System.out.print("the given array in ascending order is = {");
			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("}");
		} else if (choice == 'D') {
			System.out.print("the given array in descending order is = {");
			for (int i = size; i > 0; i--) {
				System.out.print(arr[i - 1] + " ");
			}
			System.out.println("}");

		}

	}

	public static void concatenateTwoArray() {
		System.out.print("Enter the total number of inputs for first array \t:");
		int sizeOfFirstArray = input.nextInt();
		int[] firstArray = new int[sizeOfFirstArray];
		for (int i = 0; i < sizeOfFirstArray; i++) {
			System.out.print("enter the number " + (i + 1) + "\t:");
			firstArray[i] = input.nextInt();
		}
		System.out.print("the given  first array is = {");
		for (int i = 0; i < sizeOfFirstArray; i++) {
			System.out.print(firstArray[i] + " ");
		}
		System.out.println("}");
		System.out.print("Enter the total number of inputs for second array\t:");
		int sizeOfSecondArray = input.nextInt();
		int[] secondArray = new int[sizeOfSecondArray];
		for (int i = 0; i < sizeOfSecondArray; i++) {
			System.out.print("enter the number " + (i + 1) + "\t:");
			secondArray[i] = input.nextInt();
		}
		System.out.print("the second array is = {");
		for (int i = 0; i < sizeOfSecondArray; i++) {
			System.out.print(secondArray[i] + " ");
		}
		System.out.println("}");
		int totalSize=sizeOfFirstArray+sizeOfSecondArray;
		int concatenate[]=new int[totalSize];
		for(int i=0;i<sizeOfFirstArray;i++) {
			concatenate[i]=firstArray[i];	
		}
		for(int i=0;i<sizeOfSecondArray;i++) {
			concatenate[i+sizeOfFirstArray]=secondArray[i];
		}
		System.out.print("the concatenate array is : {");
		for (int i = 0; i < totalSize; i++) {
			System.out.print(concatenate[i] + " ");
		}
		System.out.println("}");
		
	}
	public static void removeDuplicate() {
		System.out.print("Enter the total number of inputs\t:");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("enter the number " + (i + 1) + "\t:");
			arr[i] = input.nextInt();
		}
		System.out.print("the given array is = {");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("}");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=0;
				}
			}
		}
		for(int i=0;i<size-1;i++) {
			if(arr[i]==0) {
				arr[i]=arr[i+1];
				arr[i+1]=0;
			}
		}
		System.out.print("the given array after removing duplicate values is : {");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("}");
		
	}

	public static void main(String[] args) {
		sortArray();
		concatenateTwoArray();
		removeDuplicate();
	}

}
