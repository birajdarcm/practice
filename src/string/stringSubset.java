package string;

import java.util.Arrays;

public class stringSubset 
{
	public static void main(String[] args) 
	{
		String s="FUN";
		int n=s.length();
		int sub= n*(n+1)/2;      //6
		String arr[]=new String[n*(n+1)/2];
		int temp=0;
			
		for(int i=0;i<n;i++)
		{
			for(int j=i; j<n;j++)
				{
				arr[temp]=s.substring(i,j+1);
				temp++;
//				System.out.println(s.charAt(temp));
				}
			
		}
		System.out.println("subsets are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
