package org.ZohoSchoolGraduateTraining;
import java.util.*;
public class DifferenceBetweenNumbers {

	public static void differenceBetweenReverseNumbers(int n) {
		int reverse =0,temp=n;
		while(temp>0) {
			reverse = reverse*10 +temp%10;
			temp=temp/10;	
		}
		System.out.println(n+" - "+reverse+" = "+(n-reverse));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number to find difference");
		int num = input.nextInt();
		differenceBetweenReverseNumbers(num);
	}
}
