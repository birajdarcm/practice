package string;
//16. Java Program to find Reverse of the string.
public class stringReverse 
{
	public static void main(String[] args) 
	{
	String s="chetan";
	String rev= "";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev+=s.charAt(i);
	}
		System.out.print(rev);
	}
}
