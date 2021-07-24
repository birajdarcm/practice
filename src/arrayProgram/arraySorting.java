package arrayProgram;
import java.util.Arrays;


public class arraySorting 
{
	
	public static void main(String[] args) 
	{
		int [] a= {12,21,13,34,25};
		
		Arrays.sort(a);
		
		System.out.println("ascending order");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	
	
	}

}
