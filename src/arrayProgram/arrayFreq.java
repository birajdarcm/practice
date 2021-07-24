package arrayProgram;

public class arrayFreq 
{
	
	public static void main(String[] args) 
	{
		int [] a={5,1,2,8,2,3};
		
//		int [] b= new int[a.length];
		
//		int [] c;
		
		int num;								
		
		for (int j=0;j<a.length;j++)
		{	
			num=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[j]==a[i])
				{
					num++;
				}
			}
			
			System.out.println(a[j]+"  "+num);
		}
	}

}
