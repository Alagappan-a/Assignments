package Training;

import java.util.Scanner;

public class OddNumbers {
	public static void printOddNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the range starting number");
		int startNumber = input.nextInt();
		System.out.println("Enter the range ending number");
		int endNumber = input.nextInt();
		System.out.println("The Odd numbers of given ranges are:");
		if(startNumber%2==0) {
			startNumber=startNumber+1;
		}
		for(int i=startNumber;i<=endNumber;i=i+2) {
			System.out.print(i+",");
		}
	}
	public static void main(String[] args) {
		printOddNumber();
	}

}
