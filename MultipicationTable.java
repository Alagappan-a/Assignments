package Training;

import java.util.Scanner;

public class MultipicationTable {
	public static void tableCalculator() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for table");
		int num = input.nextInt();
		System.out.println("The multipication table of number" + num);
		for (int i = 1; i <= 20; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));
		}
	}

	public static void main(String[] args) {
		tableCalculator();
	}
}
