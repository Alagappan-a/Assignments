package Training;

import java.util.Scanner;

public class ElectionCommission {
	static Scanner input = new Scanner(System.in);

	public static void voterInformation() {
		int overAllCount = 0, maleCount = 0, femaleCount = 0, transgenderCount = 0, eligibleCount = 0,
				eligibleMaleCount = 0, eligibleFemaleCount = 0, eligibleTransgenderCount = 0;

		char reChoice;
		do {
			System.out.println("Enter the voter details");
			overAllCount++;
			System.out.println("**************************************************");
			System.out.print("Enter the voter name\t:");
			String name = input.next();
			System.out.print("Enter the vote age\t:");
			int age = input.nextInt();
			System.out.print("Enter the voter gender(Ex:male,female,transgender)\t :");
			String gender = input.next();
			if (age >= 18) {
				if (gender.equals("male")) {
					System.out.println("Mr." + name + " is eligble to vote");
					maleCount++;
					eligibleCount++;
					eligibleMaleCount++;

				}
				if (gender.equals("female")) {
					System.out.println("Mrs/Miss." + name + " is eligble to vote");
					femaleCount++;
					eligibleCount++;
					eligibleFemaleCount++;
				}
				if (gender.equals("transgender")) {
					System.out.println("Mr/Miss." + name + " is eligble to vote");
					transgenderCount++;
					eligibleCount++;
					eligibleTransgenderCount++;
				}
			}
			if (age < 18) {
				if (gender.equals("male")) {
					System.out.println("Mr." + name + " is not eligble to vote");
					maleCount++;

				}
				if (gender.equals("female")) {
					System.out.println("Miss." + name + " is eligble to vote");
					femaleCount++;

				}
				if (gender.equals("transgender")) {
					System.out.println("Mr/Miss." + name + " is eligble to vote");
					transgenderCount++;
				}
			}

			System.out.println("Do you want to continue?(if yes:enter'y')(if no:'n')");
			reChoice = input.next().charAt(0);
			if (reChoice == 'n') {
				System.out.println("The total  number of voter visted today\t:" + overAllCount);
				System.out.println("The total  number of male voter visted today\t:" + maleCount);
				System.out.println("The total  number of female voter visted today\t:" + femaleCount);
				System.out.println("The total  number of transgender voter visted today\t:" + transgenderCount);
				System.out.println("The total  number of eligible voter visted today\t:" + eligibleCount);
				System.out.println("The total  number of eligible male voter visted today\t:" + eligibleMaleCount);
				System.out.println("The total  number of eligible female voter visted today\t:" + eligibleFemaleCount);
				System.out.println(
						"The total  number of eligible transgender voter visted today\t:" + eligibleTransgenderCount);

			}

		} while (reChoice == 'y');
	}

	public static void main(String[] args) {
		voterInformation();
	}
}
