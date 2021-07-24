package StarPattern;



public class largestOfThreeNumbers 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=15;
		int c=7;
		
		if(a>b && a>c)
		{
			System.out.printf("largest number is%d",a);
		}
		
		else if(b>a && b>c)
		{
			System.out.printf("largest number is %d",b);
		}
		
		else
		{
			System.out.printf("largest number is %d",c);
		}
		
	}	
}



