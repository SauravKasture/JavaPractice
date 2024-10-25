package CoreJavaPractice;

public class SumofSquares {

	public static long sumofSquares(int number) {
		if (number <= 0) {
			return -1;
		}

		long sum = 0;
		for (int i = 1; i <= number; i++) {
//			sum = sum + (i * i);
			sum += i * i;
			System.out.println(sum);

		}
		return sum;

	}

	public static void main(String[] args) {
//		System.out.println(sumofSquares(5));
		sumofSquares(5);
	}
}
