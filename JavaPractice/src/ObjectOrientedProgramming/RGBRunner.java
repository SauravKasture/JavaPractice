
package ObjectOrientedProgramming;

public class RGBRunner {
	public static void main(String[] args) {
		RGBColor color=new RGBColor(255, 51, 0);
		System.out.println(color.getRed());
		System.out.println(color.getGreen());
		System.out.println(color.getBlue());
		color.invert();
		System.out.println(color.getRed());
		System.out.println(color.getGreen());
		System.out.println(color.getBlue());
		System.out.println(Integer.MAX_VALUE);

	}
	

}
