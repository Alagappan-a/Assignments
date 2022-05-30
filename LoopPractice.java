package org.ZohoSchoolGraduateTraining;

import java.util.*;
import java.math.*;

public class LoopPractice {
	Scanner input = new Scanner(System.in);

	public static void trianglePattern(byte num) {
		String star = "";
		for (int i = 0; i < num; i++) {
			for (int j = (num - 1) - i; j > 0; j--) {
				System.out.print(" ");
			}
			star += "* ";
			System.out.println(star);

		}
	}

	public static void reverseTrianglePattern(byte num) {

		for (int i = num; i > 0; i--) {
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >0; k--) {
				String star = "";
				star += "* ";
				System.out.print(star);

			}
			System.out.println();
		}
	}
	public static void hollowTriangle(byte num) {
		int i, j, k, rows=num;  
		for (i=1; i<= rows ; i++)  
		{  
		for (j = i; j < rows ; j++)   
		{  
		System.out.print(" ");  
		}     
		for (k = 1; k <= (2*i -1) ;k++)   
		{  
		if(k==1 || i == rows || k==(2*i-1))   
		{  
		System.out.print("*");  
		}  
		else   
		{  
		System.out.print(" ");  
		}  
		}  
		System.out.println("");
	}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		byte num = input.nextByte();
		trianglePattern(num);
		reverseTrianglePattern(num);
		hollowTriangle(num);

	}
}
