package arrayProgram;

public class fibonasiSeries 
{
	
	public static void main(String[] args) 
	{
		// 0 1 1 2 3 5 8 13 21 
		
		int n1=0;
		int n2=1;
		
		for(int i=0;i<=10;i++)
		{
			
			int n=n1+n2;
			n1=n2;
			n2=n;
			
			System.out.print(n+" ");
		}
		
			
		
		
		
	}

}
