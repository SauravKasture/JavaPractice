package CoreJavaPractice;

public class MultiplicationTable {


	
	// Refactoring the code
	void multiplicationTable(int number) {
		multiplicationTable(number, 1, 10);
	}
	void multiplicationTable(int number, int to, int from ) {
		for (int i= to; i<=from; i++) {
			System.out.printf("%d * %d = %d", number, i,number*i ).println();;
		}
	}
}
