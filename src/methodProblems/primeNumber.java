package methodProblems;

public class primeNumber {

	public static void main(String[] args) {

		int num = 93;

		if (checkNumber(num)) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}

	}

	public static boolean checkNumber(int num) {
		int count = num / 2;
		boolean flag=true;
		for (int i = 2; i <= count; i++) {
			if (num % i != 0) {
				flag=false;
			}
		}
		return flag;
	}
}
