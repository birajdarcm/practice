package methodProblems;
import java.util.Scanner;
public class evenOrOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		findEvenorOdd(num);
	}
	public static void findEvenorOdd(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is a Even number");
		} else {
			System.out.println("Odd number");
		}
	}
}
 