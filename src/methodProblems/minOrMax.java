package methodProblems;

import java.util.Scanner;

public class minOrMax {
	public static void main(String[] args) {

		int[] arr = readArray();
//		minimum(arr);
		System.out.println("minimum value is: " +minimum(arr));
//		maximum(arr);
		System.out.println("maximum value is: "+maximum(arr));

	} 

	public static int maximum(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
	public static int minimum(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int[] readArray() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter numbers in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}

}
