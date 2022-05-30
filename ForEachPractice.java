package org.ZohoSchoolGraduateTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachPractice {

	public static void main(String[] args) {
		List employeeData =new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Employee name \t: ");
		String name = input.nextLine();
		employeeData.add(0, name);
		System.out.print("Enter Employee Contact Number \t: ");
		long mobileNumber = input.nextLong();
		employeeData.add(1, mobileNumber);
		System.out.print("Enter Employee ID number \t: ");
		long id_No = input.nextLong();
		employeeData.add(2, id_No);
		
		for (Object data : employeeData) {
			System.out.print(data+"\t");
		}
		System.out.println();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
