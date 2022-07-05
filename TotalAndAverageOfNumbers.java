package Training;

import java.util.Scanner;

public class TotalAndAverageOfNumbers {
	static Scanner input = new Scanner(System.in);
	public static void printTotalAndAverageOfNumbers() {
		System.out.println("Enter the total number of inputs");
		int numberOfInputs = input.nextInt();
		int sum =0;
		for (int i=1;i<=numberOfInputs;i++) {
			System.out.println("Enter the number"+i);
			int num = input.nextInt();
			sum=sum+num;
		}
		double average = (double)sum/numberOfInputs;
		System.out.println("The total value of given number is:"+sum);
		System.out.println("The average value of given number is:"+average);
		
	}
	public static void printTotalAndAverageOfOddNumbers() {
		System.out.println("Enter the total number of inputs");
		int numberOfInputs = input.nextInt();
		int sum =0,count=0;
		for (int i=1;i<=numberOfInputs;i++) {
			System.out.println("Enter the number"+i);
			int num = input.nextInt();
			if(num%2!=0) {
			sum=sum+num;
			count++;
			}
		}
		double average = (double)sum/count;
		System.out.println("The total value of given number is:"+sum);
		System.out.println("The average value of given number is:"+average);
		
	}
	public static void printTotalAndAverageOfEvenNumbers() {
		System.out.println("Enter the total number of inputs");
		int numberOfInputs = input.nextInt();
		int sum =0,count=0;
		for (int i=1;i<=numberOfInputs;i++) {
			System.out.println("Enter the number"+i);
			int num = input.nextInt();
			if(num%2==0) {
			sum=sum+num;
			count++;
			}
		}
		double average = (double)sum/count;
		System.out.println("The total value of given number is:"+sum);
		System.out.println("The average value of given number is:"+average);
		
	}

	public static void main(String[] args) {
		printTotalAndAverageOfNumbers();
		printTotalAndAverageOfOddNumbers();
		printTotalAndAverageOfEvenNumbers();
	}
}
