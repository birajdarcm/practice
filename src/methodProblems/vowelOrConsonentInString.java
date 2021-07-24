package methodProblems;

import java.util.Scanner;

public class vowelOrConsonentInString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");

		String str = scan.next();

		int vowels = vowelOrConso(str);

		System.out.println(vowels);

	}

	public static int vowelOrConso(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' | ch=='e'|ch=='i'|ch=='o'|ch=='u') {
				count++;
			}
		}
		return count;
	}
}
