package methodProblems;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		int result = sumOfNumber(num);
		System.out.println(result);
	}

	public static int sumOfNumber(int num) {

		int sum = 0;

		while (num > 0) {
			sum += (num % 10);

			num = num / 10;
		}
		return sum;

	}

}
