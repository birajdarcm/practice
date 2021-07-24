package string;
//1. Java Program to count the total number of characters in a string
public class stringCharacter 
{
	public static void main(String[] args) 
	{
	String s="The best of both worlds";
	int count=0;
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		count++;		
	}
	
	System.out.println(count);
}
}