package matrix;

public class matrixSumOfRow 
{
	
	public static void main(String[] args)
	{
		int [][] a= {
						{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}
					};
		
		
		for(int i=0;i<3;i++)
		{
			int sum=0;
			for(int j=0;j<3;j++)
			{
				sum+=a[i][j];
			}
			
			System.out.printf("Sum of row %d is: %d",i,sum);
			System.out.println();
			
		}
		
		
		
	}
}

