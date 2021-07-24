package string;
//2. Java Program to determine whether a given string is palindrome
public class stringPalindrome 
{
	public static void main(String[] args) 
	{
	String s="noon";
	String rev= "";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev+=s.charAt(i);
	}
	
	System.out.println(s);
	System.out.println(rev);
	if(s.equals(rev))
	{
		System.out.print("given word is palindrome");
	}
	
	else
	{
		System.out.println("given word is not a palindrome");
	}
	}
}
