package arrayProgram;

public class arrayDuplicateNew 
{
	
	public static void main(String[] args) 
	{

		int [] a = new int [] {1,1,1,2,2,2,3,4};	
		
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate elements are "+a[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate elements not found");
		}

	}

}
