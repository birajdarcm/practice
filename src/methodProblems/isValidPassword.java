package methodProblems;

import java.util.Scanner;

public class isValidPassword {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a password");
		String pass = scan.next();
		int passlength = pass.length();

		if (passlength >= 10) {
			if (isValidPass(pass)) {
				System.out.println("valid");
			}

			else { 
				System.out.println("invalid");
			}
		} 
		else {
			System.out.println("invalid");
		}
	}

	public static boolean isValidPass(String pass) {
		int charCount=0; 
		int digitCount=0;
		for (int i = 0; i < pass.length(); i++) {
		char ch = pass.charAt(i);
			if(isNumeric(ch)) {
				digitCount++;
				}
				else if(isLetter(ch)) {
					charCount++;
				}
				
			}
		return (digitCount>=2);
	}

	public static boolean isNumeric(char ch) {
		return (ch >= '0' && ch <= '9');
	}

	public static boolean isLetter(char ch) {
		return (ch >= 'a' && ch <= 'z');
	}

}
