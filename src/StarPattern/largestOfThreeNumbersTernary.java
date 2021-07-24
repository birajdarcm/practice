package StarPattern;

import java.util.Scanner;

public class largestOfThreeNumbersTernary 
{
	public static void main(String[] args) 
	{
		
		int a,b,c,large;
		Scanner scan=new Scanner(System.in); //object of the scanner class
		
		System.out.println("Enter first number");
		a=scan.nextInt();
		System.out.println("Enter second number");
		b=scan.nextInt();
		System.out.println("Enter three number");
		c=scan.nextInt();
		
		int temp=a>b?a:b;

		large=temp>c?temp:c;
		System.out.println("largest number is "+large);
		
	}	
}



