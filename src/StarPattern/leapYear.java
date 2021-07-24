package StarPattern;

import java.util.Scanner;



public class leapYear 
{
	public static void main(String[] args) 
	{
		int x;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter year");
		x=scan.nextInt();
		
//		if((x%4==0) && (x%100!=0) || (x%400==0))
//		{
//			System.out.println("leap year");
//		}
//		else
//		{
//			System.out.println("not a leap year");
//		}
		
		while((x%4==0) && (x%100!=0) || (x%400==0))
		{
			System.out.printf("%d is a leap year",x);
			break;
		}
		
		
	

		
	}
}



