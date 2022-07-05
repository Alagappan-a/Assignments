package Training;

import java.util.Scanner;

public class Fibonacci {

	public static void fibonacci() {
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		int maxNumber = input.nextInt();
		int firstNumber = 0, secondNumber = 1, thirdNumber = 0;
		System.out.println("the Fibonacci series upto " + maxNumber);
		System.out.print( firstNumber +", "+ secondNumber  );
		for (int i = 0; thirdNumber < maxNumber - firstNumber; i++) {
			thirdNumber = secondNumber + firstNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			System.out.print(", "+thirdNumber  );
		}

	}

	public static void main(String[] args) {

		fibonacci();
	}
}
