package org.ZohoSchoolGraduateTraining;

import java.util.Scanner;

public class ExerciseProgram {
	public static void multiplication(int n) {
		System.out.println("mutliplication table for given number:" + n);
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (i * n));
		}
	}

	public static void subtraction(int n) {
		System.out.println("subtraction table for given number:" + n);
		for (int i = n; i <= 10 + n; i++) {
			System.out.println(n + " - " + i + " = " + (i - n));
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to generate table");
		int num = input.nextInt();
		multiplication(num);
		subtraction(num);
	}
}
