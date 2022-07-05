package Training;

import java.util.Scanner;

public class PalindromeNumber {
	static Scanner input = new Scanner(System.in);
	public static void isPalindrome() {
		System.out.println("Enter the number to find palindrome or not");
		int num = input.nextInt();
		int reverse=0,temp=0,temp2=0;
		temp=num;
		while(temp>0) {
			temp2=temp%10;
			reverse=(reverse*10)+temp2;
			temp=temp/10;
			
		}
		if (reverse==num) {
			System.out.println(num+" is a palindrome number");
		}
		else {
			System.out.println(num+" is not a palindrome number");
		}
	}
public static void main(String[] args) {
	isPalindrome();
}
}
