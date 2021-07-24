package lang;

public class student 
{

	String name;
	int rollno;
//Constructor
	student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
	public String toString()
	{
		return name+"....."+rollno;
	}
		
	public static void main(String[] args) 
	{
		student s1=new student("Durga",101);
		student s2=new student("Ravi",102);
		
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}

}
