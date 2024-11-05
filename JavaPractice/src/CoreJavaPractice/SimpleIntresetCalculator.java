package CoreJavaPractice;

import java.math.BigDecimal;

public class SimpleIntresetCalculator {
	// Simple Interest Formula
//	Total Amount = principle + (Principle*interest * noOfYears)
	private BigDecimal principle;
	private BigDecimal interest;


	// sending the string input to BigDecimal Class
	public SimpleIntresetCalculator(String principle, String interset) {
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interset).divide(new BigDecimal(100));

	}

	public BigDecimal calculateTotalValues(int noOfYears) {
		BigDecimal noOfYearsBig = new BigDecimal(noOfYears);
		BigDecimal totalAmount = principle.add(principle.multiply(interest).multiply(noOfYearsBig));
		return totalAmount;
	}

}
