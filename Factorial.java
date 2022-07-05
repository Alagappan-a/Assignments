package Training;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[])

	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input.nextInt();
		int sum = 1;
		while (num > 0) {
			sum = sum * num--;
		}
		System.out.println("factorial of given number is :" + sum);
	}
}

