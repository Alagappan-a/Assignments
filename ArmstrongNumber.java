package Training;

import java.util.Scanner;

public class ArmstrongNumber {
	static Scanner input = new Scanner(System.in);
	public static void isArmstrongNumber() {
		System.out.println("Enter the number to find Armstrong or not");
		int num = input.nextInt();
		int cube=0,temp1=0,temp2=0;
		temp1=num;
		while(temp1>0) {
			temp2=temp1%10;
			cube=cube + (temp2 * temp2 * temp2);
			temp1=temp1/10;
			
		}
		if (cube==num) {
			System.out.println(num+" is a palindrome number");
		}
		else {
			System.out.println(num+" is not a palindrome number");
		}
	}
	public static void printArmstrongNumber() {
		System.out.println("Enter the start number ");
		int startNumber = input.nextInt();
		System.out.println("Enter the end number ");
		int endNumber = input.nextInt();
		System.out.println("the armstrong number between "+startNumber+" to "+endNumber);
		if (startNumber < endNumber) {
			for(int i=startNumber;i<=endNumber;i++) {
			int cube=0,temp1=0,temp2=0;
			temp1=i;
			while(temp1>0) {
				temp2=temp1%10;
				cube=cube + (temp2 * temp2 * temp2);
				temp1=temp1/10;
				
			}
			if (cube==i) {
				System.out.print(i+" ");
			}
		}
		}
	}
public static void main(String[] args) {
	isArmstrongNumber();
	printArmstrongNumber();
}
}
