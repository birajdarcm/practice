package arrayProgram;

public class arrayEvenOddNo 
{
	
	public static void main(String[] args) 
	{
		int [] a= {12,21,13,34,25};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even " +a[i]);
			}
			
			else 
			{
				System.out.println("odd  " +a[i]);
			}
		}
		
	}

}
