package CoreJavaPractice;

public class MyChar {
	// isVowels Vowels 'a', 'e', 'i', 'o', 'u' and Capitals
	// isNumber
//	 isAlphabet
// listOfLowerCaseAlphabets 
//	listUpparCaseAlphabets
	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		// a, e, i, o, u or A E I O U
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		} else {
			return false;
		}

	}

	// character other than vowels


	public boolean isDigit() {
		// all numbers are lies between 48 which ASCII value of 0 and 57 is the ASCII
		// value for 9.
		if (ch >= 48 && ch <= 57) // between 0 and 9
		{
			return true;
		}
		return false;
	}

	// ASCII Values for lower case char a 97 and 122 & for Case it 65 to 90
	public boolean isAlphabet() {
		if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() == true && isVowel() == !true) {
			return true;
		}
		return false;
	}

	public static void printLowerCaseAlphabets() {
		// internally char are number
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);

		}
	}

	public static void printUpperCaseAlphabets() {

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);

		}
	}
}
