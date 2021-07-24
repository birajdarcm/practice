package string;

import java.util.Arrays;

public class stringLongestWord 
{
	public static void main(String[] args) 
	{
		String s="Hardships often prepare ordinary people for an extraordinary destiny";
//		String word = "", small="", large="";
		String [] arr=s.split("\\s");
		int [] p=new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			p[i]=arr[i].length();
		}
		
		
		
		
		
		
//		
//		String [] words = new String[100];
//		int temp=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)!=' ')
//			{
//				word=word+s.charAt(i);
//			}
//			words[temp]=word;
//			temp++;
//			
//			
//		if(words.length<=small.length())
//		{
//			small=words[temp];
//		}
//		else
//		{
//			large=words[temp];
//		}
//		}
//		System.out.println(small);
	}
}



