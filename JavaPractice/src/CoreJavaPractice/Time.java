package CoreJavaPractice;

public class Time {
	public static int convertHoursToMinutes(int hours) {
		if (hours < 0) {
			return -1;
		} else {
			int minutes = hours * 60;
			return minutes;
		}
	}

	public static int convertDaystoMinutes(int days) {
		if (days < 0) {
			return -1;
		} else {
			int mintues = days * 24 * 60;
			return mintues;
		}
	}

	public static void main(String[] args) {
		System.out.println(convertHoursToMinutes(2));
	}
}
