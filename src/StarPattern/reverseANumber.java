package StarPattern;



public class reverseANumber 
{
	public static void main(String[] args) 
	{
		
		int number=102003;
		int reverse=0;
		
		while(number>0)
			{
				int x=number%10;
				
				reverse=reverse*10+x;
				number=number/10;
			}
		System.out.println(reverse);
	}	

}



