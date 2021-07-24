package StarPattern;

public class palindron {

	public static boolean checkPalindrome(String a) {
		String p = "";
		
		for (int i = a.length() - 1; i >= 0; i--) {
			p += a.charAt(i);
		}
		if (a.equals(p))
			return true;
		else {
			return false;
		}
	}

	public static int adjacentElementsProduct(int[] arr) {
		int mp = arr[0] * arr[1];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] * arr[i + 1] > mp)
				mp = arr[i] * arr[i + 1];
		}
		return mp;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 0, 7, 1, 2 };
		System.out.println(adjacentElementsProduct(a));
	}

}
