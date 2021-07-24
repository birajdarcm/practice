package StarPattern;

import java.util.Scanner;

public class grading 
{
	public static void main(String[] args) 
	{
		int marks;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks");
		marks=scan.nextInt();
		
		if(marks>75)
		{
			System.out.println("Destinction");
		}
		else if(marks<=75 && marks>60)
		{
			System.out.println("First class");
		}
		else if(marks<=60 && marks>50)
		{
			System.out.println("Second Class");
		}
		else if(marks<=50 && marks>35)
		{
			System.out.println("Pass");
		}
		else
		{
		System.out.println("Fail");	
		}
				
	}
}



