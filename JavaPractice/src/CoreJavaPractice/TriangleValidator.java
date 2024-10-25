package CoreJavaPractice;

public class TriangleValidator {
	public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
		if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
			return false;
		}
		int sumOfTriangle = (angle1 + angle2 + angle3);

		if (sumOfTriangle == 180) {
			return true;
		} else {
			return false;
		}

	}

	// pythagorus therome
	// hypotenuse * hypotenuse= side1 * side1 + side2 * side2
	public static boolean isRightAngle(int hyptoenuse, int side1, int side2) {
		if (hyptoenuse <= 0 || side1 <= 0 || side2 <= 0) {
			return false;
		}
		int additionOfSquareOfOtherTwoSide = side1 + side2;
		return hyptoenuse * hyptoenuse == additionOfSquareOfOtherTwoSide;
	}
	public static void main(String[] args) {
//		System.out.println(TriangleValidator.isValidTriangle(100, 40, 40));
		System.out.println(isRightAngle(3, 4, 5));
	}
}
