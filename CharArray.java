package Training;

import java.util.Scanner;
import java.util.*;

public class CharArray {
	static Scanner sc = new Scanner(System.in);

	public static void printSentence() {
		System.out.print("Enter your statement");
		String statement = sc.nextLine();
		int len = statement.length();
		char[] input = new char[len];
		for (int i = 0; i < len; i++) {
			input[i] = statement.charAt(i);
			input[i] = Character.toLowerCase(input[i]);
		}
		System.out.print("Upper case statement:\n");
		for (int i = 0; i < len; i++) {
			System.out.print(Character.toUpperCase(input[i]));
		}
		System.out.println();
		System.out.print("Lower case statement:\n");
		for (int i = 0; i < len; i++) {
			System.out.print((input[i]));
		}
		System.out.println();
		System.out.print("sentence case statement:\n");
		for (int i = 0; i < len; i++) {
			if (input[0] != ' ') {
				input[0] = Character.toUpperCase(input[0]);
			}
			if (input[i] == '.') {
				input[i + 1] = Character.toUpperCase(input[i + 1]);
			}
			System.out.print((input[i]));
		}
		System.out.println();
		System.out.print("Title case statement:\n");
		for (int i = 0; i < len; i++) {
			if (input[0] != ' ') {
				input[0] = Character.toUpperCase(input[0]);
			}
			if (input[i] == ' ' || input[i] == '.') {
				input[i + 1] = Character.toUpperCase(input[i + 1]);
			}
			System.out.print((input[i]));
		}
		System.out.println();
	}

	public static void reverseString() {
		System.out.print("Enter your statement");
		String statement = sc.nextLine();
		int len = statement.length();
		char[] input = new char[len];
		for (int i = 0; i < len; i++) {
			input[i] = statement.charAt(i);
		}
		for (int i = len - 1; i >= 0; i--) {
			System.out.print((input[i]));
		}
		System.out.println();
	}

	public static void findFirstPosition() {
		System.out.print("Enter your statement");
		String statement = sc.nextLine();
		int len = statement.length();
		char[] input = new char[len];
		for (int i = 0; i < len; i++) {
			input[i] = statement.charAt(i);
		}
		System.out.println("enter the character to find position");
		char find = sc.nextLine().charAt(0);
		for (int i = 0; i < len; i++) {
			if (input[i] == find) {
				System.out.println("First position of given character '" + input[i] + "' is :" + (i + 1));
				break;
			}
		}
	}

	public static void findNthPosition() {
		System.out.print("Enter your statement");
		String statement = sc.nextLine();
		int len = statement.length();
		char[] input = new char[len];
		for (int i = 0; i < len; i++) {
			input[i] = statement.charAt(i);
		}
		System.out.println("enter the character to find position");
		char find = sc.nextLine().charAt(0);
		System.out.println("Enter the position :");
		int position = sc.nextInt();
		for (int i = position; i < len; i++) {
			if (input[i] == find) {
				System.out.println(
						" position of given character '" + input[i] + "'after '" + position + "' is :" + (i + 1));
				break;
			}
		}
	}

	public static void replaceCharacter() {
		System.out.print("Enter your statement");
		String statement = sc.nextLine();
		int len = statement.length();
		char[] input = new char[len];
		int counter = 0;
		for (int i = 0; i < len; i++) {
			input[i] = statement.charAt(i);
		}
		System.out.println("enter the character to find and replace");
		char find = sc.nextLine().charAt(0);
		System.out.println("enter the new character to replace");
		char newCharacter = sc.nextLine().charAt(0);
		System.out.print("final statement:");
		for (int i = 0; i < len; i++) {
			if (input[i] == find) {
				input[i] = newCharacter;
				counter++;
			}
			System.out.print(input[i]);
		}
		System.out.println();
		if (counter == 0) {
			System.out.println("entered character not found in the given string.No change in the string");
		}
	}

	public static void isEqual() {
		System.out.print("Enter your first statement");
		String firstStatement = sc.nextLine();
		int len1 = firstStatement.length();
		boolean result = true;
		char[] input = new char[len1];
		for (int i = 0; i < len1; i++) {
			input[i] = firstStatement.charAt(i);
		}
		System.out.print("Enter your second statement");
		String secondStatement = sc.nextLine();
		int len2 = secondStatement.length();
		char[] input2 = new char[len2];
		for (int i = 0; i < len2; i++) {
			input2[i] = secondStatement.charAt(i);
		}
		if (len1 == len2) {
			for (int i = 0; i < len1; i++) {
				if (input[i] != input2[i]) {
					result = false;
				}
			}
			if (result) {
				System.out.println("the given strings are equal");
			}
			if (!result) {
				System.out.println("the given strings are not equal");
			}
		} else {
			System.out.println("the given strings are not equal");
		}
	}

	public static void substring() {
		System.out.print("Enter your statement");
		String statement = sc.nextLine();
		int len = statement.length();
		char[] input = new char[len];
		for (int i = 0; i < len; i++) {
			input[i] = statement.charAt(i);
		}
		System.out.println("enter the starting position");
		int position = sc.nextInt();
		System.out.println("enter the end position");
		int endPosition = sc.nextInt();
		if (endPosition > len) {
			endPosition = len;
		}
		System.out.println("the substring statement:");
		for (int i = position - 1; i < endPosition - 1; i++) {
			System.out.print(input[i]);
		}

	}

	public static void ascendingOrder() {
		System.out.print("Enter your statement:");
		String statement = sc.nextLine();
		int len = statement.length();
		char[] input = new char[len];
		for (int i = 0; i < len; i++) {
			input[i] = statement.charAt(i);
		}

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (input[i] < input[j]) {
					char temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		System.out.print("the result statement:");
		for (int i = 0; i < len; i++) {
			System.out.print(input[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printSentence();
		reverseString();
		findFirstPosition();
		findNthPosition();
		replaceCharacter();
		isEqual();
		substring();
		ascendingOrder();
	}

}
