package arrayProgram;

import java.util.Arrays;

public class arrayDuplicate {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 1, 1, 2, 2, 2, 3, 4 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] != -1) {
					if (a[i] == a[j]) {
						c++;
						a[j] = -1;
					}

				}
			}
			System.out.println(a[i] + " occurence is " + c + "times");
		}

	}

}
