package lang;

public class equal 
{
	String name;
	int rollno;
	equal (String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public static void main(String[] args) 
	{
		equal s1=new equal("Durga",101);
		equal s2=new equal("Ravi",102);
		equal s3=new equal("Durga",101);
		equal s4=s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
	

}
