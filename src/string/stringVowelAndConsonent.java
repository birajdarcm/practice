package string;

//4. Java Program to count the total number of vowels and consonants in a string.
public class stringVowelAndConsonent {
	public static void main(String[] args) {
		int vcount = 0;
		int ccount = 0;
		char c;
		String s = "123456*&^%$#m";

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vcount++;
			} else if (c >= 'a' && c <= 'z') {
				ccount++;
			}
		}
		System.out.println("Number of vowels are:- " + vcount);
		System.out.println("Number of consonents are:- " + ccount);
	}
}
