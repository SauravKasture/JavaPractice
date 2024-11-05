package ObjectOrientedProgramming;

public class RGBColor {
//	 The Red, Green, Blue color values range from 0 to 255.
	private int red; // 255
	private int green; // 255
	private int blue; // 0
	private final int fixedColor = 255;

// Constructor For RGBColor class which initialize the color with provided red, green,
	// blue values.
	public RGBColor(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		return this.red;
	}

	public int getGreen() {
		return this.green;
	}

	public int getBlue() {
		return this.blue;
	}

//	This method to invert the color. The inversion is done by subtracting each color component from 255. 
	public void invert() {
		this.red = this.fixedColor - this.red;
		this.blue = this.fixedColor - this.blue;
		this.green = this.fixedColor - this.green;
	}

}
