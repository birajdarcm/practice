package string;

public class stringRemoveSpaces 
{
	public static void main(String[] args) 
	{
		String s="This is a really simple sentence";
		String c="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
			c+=s.charAt(i);
			}
		}
		System.out.println(c);
		
	}
}
