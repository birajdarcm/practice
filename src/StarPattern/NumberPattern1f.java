package StarPattern;

public class NumberPattern1f 
{
	public static void main(String[] args) 
	{
		int n=1;
		
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
				System.out.printf("%3d",n);
				//n++;
				//n++;
				n+=2;
			}
			System.out.println();
		}
	}
}
