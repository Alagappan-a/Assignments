package org.ZohoSchoolGraduateTraining;

import java.util.*;

public class SwitchPractice {
	

	public static void switchWithBreak(char letter) {
		
		switch(letter) {
		case 'a':{
			System.out.println(letter +" is a vowel");
			break;
		}
		case 'e':{
			System.out.println(letter +" is a vowel");
			break;
		}
		case 'i':{
			System.out.println(letter +" is a vowel");
			break;
		}
		case 'o':{
			System.out.println(letter +" is a vowel");
			break;
		}
		case 'u':{
			System.out.println(letter +" is a vowel");
			break;
		}
		case 'A':{
			System.out.println(letter +" is a vowel");
			break;
		}
		case 'E':{
			System.out.println(letter +" is a vowel");
			break;
		}
		case 'I':{
			System.out.println(letter +" is a vowel");
			break;
		}
		case 'O':{
			System.out.println(letter +" is a vowel");
			break;
		}
		case 'U':{
			System.out.println(letter +" is a vowel");
			break;
		}
		default:
			System.out.println(letter+" is a consonant");
		
	}
	}
public static void switchWithOutBreak(char letter) {
		
		switch(letter) {
		case 'a':{
			System.out.println(letter +" is a vowel");
		}
		case 'e':{
			System.out.println(letter +" is a vowel");
		}
		case 'i':{
			System.out.println(letter +" is a vowel");
		}
		case 'o':{
			System.out.println(letter +" is a vowel");
		}
		case 'u':{
			System.out.println(letter +" is a vowel");
		}
		case 'A':{
			System.out.println(letter +" is a vowel");
		}
		case 'E':{
			System.out.println(letter +" is a vowel");
		}
		case 'I':{
			System.out.println(letter +" is a vowel");
		}
		case 'O':{
			System.out.println(letter +" is a vowel");
		}
		case 'U':{
			System.out.println(letter +" is a vowel");
		}
		default:
			System.out.println("default executed......");
			System.out.println(letter+" is a consonant");
		
	}
}
public static void switchRelational() {
	int num =10;
	switch(num) {
	
	}
}
public static void usingIfCommand(char letter) {
	if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') {
		System.out.println(letter +" is a vowel");
	}
	else if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U') {
		System.out.println(letter +" is a vowel");
	}
	else {
		System.out.println(letter+" is a consonant");
	}
}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the character");
		char letter = input.next().charAt(0);
		switchWithBreak(letter);
		switchWithOutBreak(letter);
		switchRelational();
		usingIfCommand(letter);
		}
	

}
