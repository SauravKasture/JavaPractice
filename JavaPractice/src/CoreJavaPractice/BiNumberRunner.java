package CoreJavaPractice;

public class BiNumberRunner {
	public static void main(String[] args) {
		BiNumber num = new BiNumber(2, 3);
		System.out.println(num.add());
		System.out.println(num.multiply());
		num.doubleNumber();
		System.out.println(num.getNumber1());
		System.out.println(num.getNumber2());
	}

}
