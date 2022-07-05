package Training;

import java.util.Scanner;

public class SimpleCalculator {
	static Scanner input = new Scanner(System.in);

	public static void calculator() {
		System.out.println("Enter your choice from the given options:('+','-',,'*','/','%')");
		char choice = input.next().charAt(0);
		if (choice == '+') {
			addTwoNumbers();
		} else if (choice == '-') {
			subtractTwoNumbers();
		} else if (choice == '*') {
			multiplyTwoNumbers();
		} else if (choice == '/') {
			divideTwoNumbers();
		} else if (choice == '%') {
			modularDivisionOfTwoNumbers();
		} else {
			System.out.println("Enter a valid input");
		}
	}

	public static void addTwoNumbers() {
		System.out.println("Enter the first number for addition");
		int firstNumber = input.nextInt();
		System.out.println("Enter the second number for addition");
		int secondNumber = input.nextInt();
		int result = firstNumber + secondNumber;
		System.out.println("addition of given two number is:" + result);
		System.out.println("Do you want to continue?{if yes:enter'y'}{if no:enter'n'}");
		char reChoice = input.next().charAt(0);
		if (reChoice == 'y') {
			calculator();
		} else if (reChoice == 'n') {
			System.out.println("thanks for using our calculator");
		} else {
			System.out.println("enter valid the command");
		}

	}

	public static void subtractTwoNumbers() {
		System.out.println("Enter the first number for subtract");
		int firstNumber = input.nextInt();
		System.out.println("Enter the second number for subtract");
		int secondNumber = input.nextInt();
		int result = firstNumber - secondNumber;
		System.out.println("subtraction of given two number is:" + result);
		System.out.println("Do you want to continue?{if yes:enter'y'}{if no:enter'n'}");
		char reChoice = input.next().charAt(0);
		if (reChoice == 'y') {
			calculator();
		} else if (reChoice == 'n') {
			System.out.println("thanks for using our calculator");
		} else {
			System.out.println("enter valid the command");
		}
	}

	public static void multiplyTwoNumbers() {
		System.out.println("Enter the first number for multipication");
		int firstNumber = input.nextInt();
		System.out.println("Enter the second number for multipication");
		int secondNumber = input.nextInt();
		int result = firstNumber * secondNumber;
		System.out.println("multipication of given two number is:" + result);
		System.out.println("Do you want to continue?{if yes:enter'y'}{if no:enter'n'}");
		char reChoice = input.next().charAt(0);
		if (reChoice == 'y') {
			calculator();
		} else if (reChoice == 'n') {
			System.out.println("thanks for using our calculator");
		} else {
			System.out.println("enter valid the command");
		}
	}

	public static void divideTwoNumbers() {
		System.out.println("Enter the first number for division");
		int firstNumber = input.nextInt();
		System.out.println("Enter the second number for division");
		int secondNumber = input.nextInt();
		double result = ((double) firstNumber / secondNumber);
		System.out.println("Division of given two number is:" + result);
		System.out.println("Do you want to continue?{if yes:enter'y'}{if no:enter'n'}");
		char reChoice = input.next().charAt(0);
		if (reChoice == 'y') {
			calculator();
		} else if (reChoice == 'n') {
			System.out.println("thanks for using our calculator");
		} else {
			System.out.println("enter valid the command");
		}
	}

	public static void modularDivisionOfTwoNumbers() {
		System.out.println("Enter the first number for modularDivision");
		int firstNumber = input.nextInt();
		System.out.println("Enter the second number for modularDivision");
		int secondNumber = input.nextInt();
		int result = firstNumber % secondNumber;
		System.out.println("modular division of given two number is:" + result);
		System.out.println("Do you want to continue?{if yes:enter'y'}{if no:enter'n'}");
		char reChoice = input.next().charAt(0);
		if (reChoice == 'y') {
			calculator();
		} else if (reChoice == 'n') {
			System.out.println("thanks for using our calculator");
		} else {
			System.out.println("enter valid the command");
		}
	}

	public static void main(String args[]) {
		calculator();
	}
}
