package UtilityProg;

public class Child extends Parent {
	public static void main(String[] args) {
		i = 20;

		System.out.println(getSum(i, 50));
		System.out.println(getSum(25,10,5));
		System.out.println(getSum(5, 5));
		
		System.out.println(Parent.getSum(5,5));
		

	}
	public static int getSum(int a, int b) {
		return a*b;
	}
}


//Access Modifiers : public , protected, private , default
//Keywords : break, continue, final ,finally,extends , implements


//Method writing :
//	<Access modifiyer> <Keyword> <Returned data tyep> <Method Name>(Arguments){
//		
//	}