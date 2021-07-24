package StarPattern;

import java.util.Scanner;

public class swappingBit 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		a=scan.nextInt();
		
		System.out.println("Enter Second Number");
		b=scan.nextInt();
		
		System.out.printf("Number before swapping are a=%d, b=%d",a,b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		 System.out.println();
		 System.out.printf("Number after swapping are a=%d and b=%d ",a,b);				
	}
}



