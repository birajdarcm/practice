package StarPattern;

public class StarPattern1c 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=n; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
