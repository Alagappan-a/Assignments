package Training;

import java.util.Scanner;

public class Uppercase {
	static Scanner input = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.print("Enter the letter to find:");
		char letter = input.next().charAt(0);
		if (65 <= letter) {
			if (letter <= 90) {
				System.out.println("The given character is Uppercase");
			}

			else if (97 <= letter) {
				if (letter <= 122) {
					System.out.println("The given character is Lowercase");
				}
			}
		} else {
			System.out.println("The given character is Specialcharacter");
		}

	}
}