package StarPattern;

public class NumberPattern1g {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int count = 0;

			for (int j = i; true; j += i) {

				System.out.printf("%3d",j);
				count++;
				if (count == 10) {
					break;
				}
			}
			System.out.println();

		}
	}
}
