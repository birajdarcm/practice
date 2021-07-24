package methodProblems;

import java.util.Scanner;

public class smallestOfThree {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter first number"); 
		double n1=scan.nextDouble();
//		int n1=scan.nextInt();
		
		System.out.println("Enter second number");
		double n2=scan.nextDouble();
//		int n2=scan.nextInt();
		
		System.out.println("Enter third number");
		double n3=scan.nextDouble();
//		int n3=scan.nextInt();		
		
		double res=smallest(n1,n2,n3);
		
		System.out.println("smallest number is "+res);
	}
	
	
	public static double smallest(double n1, double n2, double n3) {
		
		if((n1>n2) & (n1>n3))
		{
			return n1;
		}
		else if((n2>n1) & (n2>n3))
		{
			return n2;
		}
		else 
		{
			return n3;
		}
	}
	
	
	
	
	
	
	

}
