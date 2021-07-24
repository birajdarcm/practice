package StarPattern;



public class additionOfDigitsInANumber 
{
	public static void main(String[] args) 
	{
		long add=0;
		int digit=0;
		long number=12345678;
		while(number>0)
		{
		long x=number%10;
		add=add+x;		
		number=number/10;
		
		System.out.println(number);
		}
		System.out.println(add);
		
	}
}



