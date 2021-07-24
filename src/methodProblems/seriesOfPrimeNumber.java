package methodProblems;

public class seriesOfPrimeNumber {

	public static void main(String[] args) {

	for(int i=1;i<=100;i++)
	{
		int num=i;
		if (!checkNumber(num)) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
	}
		
		

	public static boolean checkNumber(int num) {
		int count = num / 2;
		boolean flag=false;
		for (int i = 2; i <= count; i++) {
			if (num % i == 0) {
				flag=true;
				break;
			}
		}
		return flag;
	}
}
