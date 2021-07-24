package methodProblems;

import java.util.Scanner;

public class sumOfTwoNumber {
	
	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=scan.nextInt();
		
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		
		int sum=add(num1,num2);
		
		System.out.println(sum);
	}
	
	public static int add(int num1,int num2) {
		
		return num1+num2;
		
	}
	
	
	

}
