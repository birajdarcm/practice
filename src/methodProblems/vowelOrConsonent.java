package methodProblems;

import java.util.Scanner;

public class vowelOrConsonent {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a character");
		String str=input.next();
		char ch=str.charAt(0);
		String s=vowelOrConso(ch);	
		System.out.println("character is:- "+s);
		
	}
	
	public static String vowelOrConso(char ch) {
		
		if(ch=='a' | ch=='e' )
		{
		
			return "vowel";
		}
		else {
			return "consonent";
		}
		
	}
	
	
	
	
	
	
	
}
