package Training;

import java.util.Scanner;

public class CharArrayCounter {
	static Scanner sc = new Scanner(System.in);
	public static void counter() {
		int character=0,words=1,vowels=0,specialChar=0,numbers=0,line=0;
		System.out.print("Enter your statement");
		String statement = sc.nextLine();
		int len = statement.length();
		character=len;
		char[] input = new char[len];
		for (int i = 0; i < len; i++) {
			input[i] = statement.charAt(i);
			if(!(input[i]>=97&&input[i]<=122||input[i]>=65&&input[i]<=90)) {
				specialChar++;
			}
			if(input[i]==' ') {
				words++;
			}
			if(input[i]=='a'||input[i]=='e'||input[i]=='i'||input[i]=='o'||input[i]=='u') {
				vowels++;
			}
			if(input[i]>=48||input[i]<=57) {
				if(!(i==0||input[i-1]>=48||input[i-1]<=57)) {
				for(int j=i+1;j<len;j++) {						
					if(input[j]==' ') {
						numbers++;
						words--;
						break;
					}
				}
			}
		}
			
			if(input[i]==10) {
				line++;
			}
			
	}
		System.out.println("the number of characters in the statement :"+character);
		System.out.println("the number of words in the statement :"+words);
		System.out.println("the number of special characters in the statement :"+specialChar);
		System.out.println("the number of lines in the statement :"+line);
		System.out.println("the number of numbers in the statement :"+numbers);
		System.out.println("the number of vowels in the statement :"+vowels);
	}
	public static void main(String[] args) {
		counter();
	}
}
