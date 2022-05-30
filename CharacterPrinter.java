package org.ZohoSchoolGraduateTraining;

import java.util.Scanner;

public class CharacterPrinter {
	public static void printAlphabet(char c) {
		for (int i = c; i <= 90; i++) {
			System.out.print((char) i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the capital alphabet");
		char alphabet = input.nextLine().charAt(0);
		printAlphabet(alphabet);
	}
}
