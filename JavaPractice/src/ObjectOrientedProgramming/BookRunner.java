package ObjectOrientedProgramming;

public class BookRunner {
	public static void main(String[] args) {
		Book artOfComputer = new Book(1000);
		Book effectiveJava = new Book(148);
		Book cleanCod = new Book(74);
		System.out.println(artOfComputer.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCod.getNoOfCopies());
//		artOfComputer.setNoOfCopies(45);
//		effectiveJava.setNoOfCopies(75);
//		cleanCod.setNoOfCopies(78);
		artOfComputer.increaseNoOfCopiese(14);
		effectiveJava.increaseNoOfCopiese(-1);
		cleanCod.increaseNoOfCopiese(47);

		System.out.println(artOfComputer.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCod.getNoOfCopies());

		artOfComputer.decreaseNoOfCopies(14);
		effectiveJava.decreaseNoOfCopies(154);
		cleanCod.decreaseNoOfCopies(47);

		System.out.println(artOfComputer.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCod.getNoOfCopies());
	}
}
