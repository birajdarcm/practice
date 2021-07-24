package StarPattern;

import java.util.Scanner;

public class signOfnNumber 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		n=scan.nextInt();
		
		if(n<0)
		{
			System.out.println("number is negative");
		}
		else if(n>0)
		{
			System.out.println("number is positive");
		}
		else
		{
			System.out.println("number is zero");
		}
				
	}
}



