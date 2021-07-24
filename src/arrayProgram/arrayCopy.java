package arrayProgram;

public class arrayCopy 
{
	
	public static void main(String[] args) 
	{
		int [] a= {10,20,30,40,50};
		
		int [] b= new int[10];
		
		for(int i=0; i<a.length; i++)
		{
			b[i]=a[i];
		}
		
		for(int i=0;i<5;i++)
		System.out.print(a[i]+" ");
		System.out.println();
		
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		
		
	}

}
