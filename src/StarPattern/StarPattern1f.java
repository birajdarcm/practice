package StarPattern;


public class StarPattern1f 
{
	public static void main(String[] args) 
	{
		int n=5;
		
		for(int i=0;i<=5;i++)
		{
			
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}

			for(int j=n;j>=1;j--)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");	
			n--;	
		}
	}

}
