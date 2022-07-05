package Training;

import java.util.Scanner;

public class PrimeNumber {
	public static void isPrime() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to find prime or not");
		int num = input.nextInt();
		int count = 0;
		if (num >= 2) {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					count++;

					break;
				}

			}
			if (count == 0) {
				System.out.println(num + " is an prime number");
			}
		} else {

			System.out.println(num + " is not prime number");
		}
	}

	public static void printPrimeNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int startNumber = input.nextInt();
		System.out.println("Enter the end number");
		int endNumber = input.nextInt();
		System.out.println("the prime numbers from " + startNumber + " to " + endNumber + ":");
		int newLine = 10;
		if (startNumber == 0) {
			startNumber = startNumber + 2;
		}
		if (startNumber == 1) {
			startNumber = startNumber + 1;
		}
		for (int i = startNumber; i <= endNumber; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}

			}
			if(newLine<i) {
				System.out.println();
				newLine*=10;
			}
			if (count == 0) {
				System.out.print(i + " ");
			}
			
			

		}
	}

	public static void main(String[] args) {
//		isPrime();
		printPrimeNumber();
	}
}
