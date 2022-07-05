package Training;

import java.util.Scanner;

public class Pattern {
	public static void starPattern() {
		String star = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = input.nextInt();
		for (int i = 0; i < num; i++) {
			star = star + "* ";
			System.out.println(star);
		}
	}

	public static void numberPattern() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int num = input.nextInt();
		String num1 = "";
		String num2 = "";
		for (int i = 1; i <= num; i++) {
			num1 = Integer.toString(i);
			num2 = num2 + num1 + " ";

			System.out.println(num2);

		}
	}

	public static void incrementPattern() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int num1 = input.nextInt();
		System.out.println("enter increment number");
		int num2 = input.nextInt();
		String tem = "";
		String result = "";
		for (int i = 1; i <= num1 * num2; i = i + num2) {
			tem = Integer.toString(i);
			result = result + tem + " ";
			System.out.println(result);
		}

	}

	public static void numberPatternReverse() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int num = input.nextInt();
		for (int i = num; i > 0; i--) {

			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= num; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
	}

	public static void starReversePattern() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = input.nextInt();
		for (int i = num; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= num; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
	public static void mirrorPattern() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = input.nextInt();
		for (int i = num; i > 0; i--) {
			for (int j = 1; j <i; j++) {
				System.out.print("  ");
			}
			for (int j = (num-i+1); j >0 ; j--) {
				System.out.print(j+" ");
			}
			for (int j = 0;j<num-i+1 ; j++) {
				System.out.print((j+1)+" ");
			}
		System.out.println();
		}

	}
	
	static void PrintDiamondPattern() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = input.nextInt();
		for(int i=0;i<num;i++) {
			
		}
	}

	public static void main(String[] args) {
		starPattern();
//		numberPattern();
		incrementPattern();
//		numberPatternReverse();
//	starReversePattern();
//		mirrorPattern();

	}

}
