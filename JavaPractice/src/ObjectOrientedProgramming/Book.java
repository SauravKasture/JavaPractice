package ObjectOrientedProgramming;

public class Book {
	private int noofCopies;

	Book() {
		this(5); // calling constructor in a constructor
	}
	Book(int noOfCopies) {
		this.noofCopies = noOfCopies;
	}

	void setNoOfCopies(int number) {
		if (number > 0)
			this.noofCopies = number;

	}

	int getNoOfCopies() {
		return this.noofCopies;
	}

	void increaseNoOfCopiese(int howMuch) {
		setNoOfCopies(this.noofCopies + howMuch);
	}

	void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noofCopies - howMuch);
	}


}
