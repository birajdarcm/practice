package methodProblems;
import java.util.Scanner;
public class middleLetterOfString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scan.next();
		
		middleLetter(str);
		System.out.println("middle letter is: " + middleLetter(str));
	}

	public static String middleLetter(String str) {
		int position;
		int length;
		if (str.length() % 2 == 0) {
			position = str.length() / 2-1;
			length = 2;
		} else {
			position = str.length() / 2;
			length = 1;
		}
		return str.substring(position, position + length);
	}
}
