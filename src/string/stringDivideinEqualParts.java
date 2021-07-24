package string;

public class stringDivideinEqualParts {
	public static void main(String[] args) {
		String s = "abcdefghijk";
		int c = 0;
		int len = s.length(); //9
		for (int i = 2; i <= s.length(); i++) {
			if (len % i == 0) {
				c = i;//3
				break;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			if ((i + 1) % c == 0)
				System.out.println();
		}

//		if (s.length() % 2 == 0 || s.length() % 3 == 0) {
//			int j = 0;
//			c = s.length() / 2;
//			int n = s.length() / c;
//			for (int k = c; k > 0; k--) {
//				for (int i = n; i > 0; i--) {
//					System.out.print(s.charAt(j));
//					j++;
//				}
//				System.out.println();
//			}
//		} else {
//			System.out.println("not possible");
//		}

	}
}
