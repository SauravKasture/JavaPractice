package ObjectOrientedProgramming;

public class Square {
	private int side;

	public Square(int side) {

		if (side <= 0) {
			this.side = -1;
		}
		this.side = side;

		// TODO: initialize side with the passed value
	}

	public int calculateArea() {
		if (this.side <= 0) {
			return -1;
		}
		return this.side * this.side;
	}

	public int calculatePerimeter() {

		return 4 * this.side;
	}
}
