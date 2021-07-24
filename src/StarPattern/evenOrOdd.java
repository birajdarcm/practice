package StarPattern;

import java.util.Scanner;



public class evenOrOdd 
{
	public static void main(String[] args) 
	{
		int x;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		x=scan.nextInt();
		
		if(x%2==0)
		{
			System.out.printf("%d is an even number",x);
		}
		else
		{
			System.out.printf("%d is and odd number",x);
		}
		
		
		
	

		
	}
}



