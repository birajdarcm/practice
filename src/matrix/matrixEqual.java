package matrix;

public class matrixEqual 
{
	
	public static void main(String[] args)
	{
		int [][] a= {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int [][] b= {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]!=b[i][j])
				{
					flag=true;
				}
				
			}
		}
		if(flag)
			System.out.println("Matrix are not equal");
		else
			System.out.println("Matrix are equal");


		
			
	}
}

