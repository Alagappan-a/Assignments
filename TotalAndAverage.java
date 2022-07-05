package Training;

import java.util.Scanner;

public class TotalAndAverage {

	static Scanner input = new Scanner(System.in);
	

	public static void printTotalAndAverage() {
		System.out.println("*****total and average of given range*****");
		System.out.println("Enter the range starting number");
		int startNumber = input.nextInt();
		System.out.println("Enter the range ending number");
		int endNumber = input.nextInt();
		int total = 0;
		double average = 0;
		for (int i = startNumber; i <= endNumber; i++) {
			total = total + i;
		}
		System.out.println("the total value of given range is:" + total);
		average = (double) total / (endNumber+1 - startNumber);
		System.out.println("the average value of given range is:" + average);
	}
	public static void PrintTotalAndAverageOddNumbers() {
		System.out.println("*****total and average of odd numbers*****");
		System.out.println("Enter the range starting number");
		int startNumber = input.nextInt();
		System.out.println("Enter the range ending number");
		int endNumber = input.nextInt();
		int total=0;
		double average = 0;
		if(startNumber%2==0) {
			startNumber=startNumber+1;
		}
		for (int i = startNumber; i <= endNumber;i= i+2) {
			total = total + i;
		}
		System.out.println("the total value of given range is:" + total);
		average = (double) total / ((endNumber+1 - startNumber)/2);
		System.out.println("the average value of given range is:" + average);
	}
	public static void PrintTotalAndAverageEvenNumbers() {
		System.out.println("*****total and average of even numbers*****");
		System.out.println("Enter the range starting number");
		int startNumber = input.nextInt();
		System.out.println("Enter the range ending number");
		int endNumber = input.nextInt();
		int total=0;
		double average = 0;
		if(startNumber%2==1) {
			startNumber=startNumber+1;
		}
		for (int i = startNumber; i <= endNumber;i= i+2) {
			total = total + i;
		}
		System.out.println("the total value of given range is:" + total);
		average = (double) total / ((endNumber+2 - startNumber)/2);
		System.out.println("the average value of given range is:" + average);
	}

	public static void main(String[] args) {
		printTotalAndAverage();
		PrintTotalAndAverageOddNumbers();
		PrintTotalAndAverageEvenNumbers();
	}
}
