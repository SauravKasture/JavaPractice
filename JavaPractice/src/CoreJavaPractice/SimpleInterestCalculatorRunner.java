package CoreJavaPractice;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {
	public static void main(String[] args) {
		SimpleIntresetCalculator sc = new SimpleIntresetCalculator("4500.00", "7.5");
		BigDecimal totalAmunt = sc.calculateTotalValues(5);
		System.err.println(totalAmunt);

	}
}
