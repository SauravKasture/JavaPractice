package ObjectOrientedProgramming;

public class Dimension {
	private int feet;
	private int inches;

	public Dimension(int inches) {
		if (inches < 0) {
			this.feet = -1;
			this.inches = -1;
		} else {
			this.feet = inches / 12;
			this.inches = inches % 12;
		}
		// 25 inches
		// 12 inches=1 foot;
		// 25 inches= 2 foot 1 inches
		// TODO: convert the total inches into feet and inches. One foot is
		// 12 inches;
		// Store the feet and inches in their respective instance variables.


	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

}
