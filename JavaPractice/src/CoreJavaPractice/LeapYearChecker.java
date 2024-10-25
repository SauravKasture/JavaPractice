package CoreJavaPractice;

public class LeapYearChecker {
	public static boolean isLeapYear(int year) {
		if (year <= 0) {
			return false;
		}
		if (year % 4 != 0) {
			return false;
		}

		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		}

		if (year % 4 == 0 && year % 100 == 0) {
			if (year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public static boolean isYearisLeap(int year) {
		if (year < 1) {
			return false;
		}
		if (year % 4 != 0) {
			return false;
		}

		if (year % 100 != 0) {
			return false;
		}
		if (year % 400 != 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isLeapYear(2001));
		System.out.println(isYearisLeap(1999));
	}
}
