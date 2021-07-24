package StarPattern;

import java.util.Scanner;



public class Age 
{
	public static void main(String[] args) 
	{
		int x;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		x=scan.nextInt();
		
		if (x>18)
		{
			System.out.println("u r an adult");
		}
		else 
		{
			System.out.println("u r minor");
		}
		
		
	}
}



