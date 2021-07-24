package lang;

public class hashcode 
{
	int i;
	hashcode(int i)
	{
		this.i=i;
		
	}
	
	public int hashCode()
	{
		return i;
	}
	public static void main(String[] args) 
	{
		hashcode t1=new hashcode(10);
		hashcode t2=new hashcode(100);
		System.out.println(t1);
		System.out.println(t2);
			
	}
	

}
