package string;

import java.util.Arrays;

public class stringIndiviChar 
{
	public static void main(String[] args) 
	{
		String s="ChArACTER";	
		s=s.toLowerCase();
		s=s.toUpperCase();
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		
//		System.out.println(small);
	}
}
