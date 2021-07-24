package StarPattern;

import java.util.Scanner;

public class switch1 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		n=scan.nextInt();
		
		switch(n)
		{
		case 1: System.out.println("Entered Number is 1");
		break;
		case 2: System.out.println("Entered Number is 2");
		break;
		case 3: System.out.println("Entered Number is 3");
		break;
		case 4: System.out.println("Entered Number is 4");
		break;
		case 5: System.out.println("Entered Number is 5");
		break;
		default: System.out.println("none");
		}
		
		
		
		
	}
}



