package StarPattern;

import java.util.Scanner;

public class sumOfNaturalNumbersUsingFun 
{
	static int naturalNumberSum(int n)
	{
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		int n = 10;
		System.out.println("Sum of Natural Numbers is:"+naturalNumberSum(n));
	}	
	
}





//Scanner scan=new Scanner(System.in);
//
//System.out.println("Enter number");
//
//int num=scan.nextInt();
//int sum=0;
//
//
//System.out.printf("sum is %d",sum);	