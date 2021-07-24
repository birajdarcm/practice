package StarPattern;

import java.util.Scanner;

public class FactorialNumber 
{
	public static void main(String[] args) 
	{
		long fact=1;
		int x;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number");
		x=scan.nextInt();
		
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+x+" is "+fact);
	
	}
}

// 3!=3*2*1

