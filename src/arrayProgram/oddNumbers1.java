package arrayProgram;

public class oddNumbers1 
{
	
	public static void main(String[] args) 
	{
		int i=100;
//		
//		for(int j=0;j<=i;j++)
//		{
//			if(j%2!=0)
//			{
//				System.out.printf("%d ",j);
//			}
//		}
//		
		for(int j=0;j<i;j++)
		{
			if(j%2!=0)
			{
				
				System.out.println(j);
				continue;
			}
		}
		
		
		
	}

}
