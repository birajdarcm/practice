package UtilityProg;
import java.util.Scanner;

public class NumberIsEvenOrOdd 
{
	public static void main(String[] args) 
	{
		int x;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter an integer");
		x=scan.nextInt();
	if (isEvenOrOdd(x))
		{
		System.out.println("number is even");
		}
	else 
	{
		System.out.println("number is odd");
	}
	}
	
	
	public static boolean isEvenOrOdd(int n)
	{
		return n%2==0;
//		if(n%2==0)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
	}

}
