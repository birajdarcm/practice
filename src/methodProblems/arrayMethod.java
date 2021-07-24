package methodProblems;
import java.util.Scanner;
public class arrayMethod {
	public static void main(String[] args) {

//		readInputArray	
		int[] arr = readInputArray();

//		do summation
		doSum(arr);
		System.out.println(doSum(arr));
	}
	public static int doSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) { 
			sum += arr[i];
		}
		return sum;
	}
	public static int[] readInputArray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("enter numbers");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;

	}

}
