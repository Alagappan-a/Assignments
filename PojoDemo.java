package org.ZohoSchoolGraduateTraining;

import java.util.Scanner;

public class PojoDemo {

public static void main(String[] args) {
		
		StudentDataDetails insert = new StudentDataDetails();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Student name \t: ");
		String tempName = input.next();
		insert.setName(tempName);
		System.out.print("Enter Student age \t: ");
		byte tempAge = input.nextByte();
		insert.setAge(tempAge);
		System.out.print("Enter Student Email.ID \t: ");
		String tempEmail_ID = input.next();
		insert.setEmail_ID(tempEmail_ID);
		
		System.out.print("Enter Student gender \t: ");
		String tempGender = input.next();
		insert.setGender(tempGender);
		
		System.out.print("Enter Student Contact Number \t: ");
		long tempMobileNumber = input.nextLong();
		insert.setMobileNumber(tempMobileNumber);
		
		System.out.print("Enter Student Resister Number \t: ");
		long tempReg_No = input.nextLong();
		insert.setReg_No(tempReg_No);
		
		
		System.out.println("Name of the student \t :"+insert.getName());
		System.out.println("Age of the Student \t :"+insert.getAge());
		System.out.println("Email.Id of the Student \t :"+insert.getEmail_ID());
		System.out.println("Gender of the Student \t :"+insert.getGender());
		System.out.println("Reg.No of the Student \t :"+insert.getReg_No());
		System.out.println("mobile number of the Student \t :"+insert.getMobileNumber());

	}
}
