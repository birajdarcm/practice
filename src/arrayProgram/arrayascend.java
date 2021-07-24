package arrayProgram;

import java.util.Arrays;

public class arrayascend 
{
	
	public static void main(String[] args) 
	{
		int [] a={6,2,3,8};
//		int temp=0;
		int m;
		
		  int min = a[0];
		    int max = a[0];
		    for (int i=1; i<a.length; ++i) {
		        min = Math.min(min, a[i]);
		        
		        max = Math.max(max, a[i]);
		    }
		    
		    m= (max-min+1) - a.length;
		    System.out.println(min);
		    System.out.println(max);
		System.out.println(m);
		
//		for(i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length;j++)
//			{
//				if(a[i]<a[j])
//					
//				{
//					temp=a[j];
//					a[j]=a[i];
//					a[i]=temp;
//				}
//			}
//		}
//		Arrays.sort(a);
//		
//		int count=0;
////		for(int n=a[0];n<=a[a.length];n++)
//		for(i=0;i<a.length-1;i++)
//		{
//			while(a[i+1]!=a[i]+1)
//			{
//				count+=a[i+1]-(a[i]+1);
//				break;
//			}
//			
//		}	
//		System.out.println(count);
//		
//		for(int j=0;j<a.length;j++)
//		{
//			System.out.print(" "+a[j]);
//		}
		
		
		
	}
}
