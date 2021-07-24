package string;

import java.util.Arrays;

public class stringRotation 
{
	public static void main(String[] args) 
	{		
		String s1="abcde";
		String s2="deabc";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("not a rotation");
		}
		else 
		{
			s1=s1.concat(s1); // abcdeabcde
			if(s1.contains(s2))
			{
				System.out.println("rotation");
			}
			else
			{
				System.out.println("not a rotation");
			}
		}
		
		
	}
}
