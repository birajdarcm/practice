package methodProblems;

public class Student {
	int rollNum;
	int classNum;
	String name;
	static String collegName="IGS";
	String parentName;

	public Student(int classNo, int rn, String studentName) {
		this.classNum = classNo;
		this.rollNum = rn;
		this.name = studentName;
		displayStudent();
	}
	
	public Student(int classNo, int rn, String studentName, String parentInfo) {
		this.classNum = classNo;
		this.rollNum = rn;
		this.name = studentName;
		this.parentName=parentInfo;
	}
	
	private  void displayStudent()
	{
		System.out.println("Student name is "+name);
		System.out.println("School Name  name is "+collegName);
		System.out.println("Roll num Name  name is "+rollNum);
		System.out.println("Class num Name  name is "+classNum);
	}
	
	public  void displayStudentParentInfo()
	{
		System.out.println("Student name is "+name);
		System.out.println("School Name  name is "+collegName);
		System.out.println("Roll num Name  name is "+rollNum);
		
		System.out.println("Class num Name  name is "+classNum);
		System.out.println("Parentname is "+parentName);
	}

}

//by defeault there is constructer in every class you put or dont put
// Constructer has to be of 
//    1. As of class
//    2. constructer does not have a return type 
