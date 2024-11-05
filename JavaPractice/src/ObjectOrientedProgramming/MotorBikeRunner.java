package ObjectOrientedProgramming;

public class MotorBikeRunner {
	public static void main(String[] args) {

		MotorBike ducati = new MotorBike(14);
		MotorBike honda = new MotorBike(18);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		ducati.start();
		honda.start();
		ducati.stop();
//		ducati.setSpeed(80);
		ducati.setSpeed(125);
		ducati.increaseSpeed(50);

		System.out.println(ducati.getSpeed());

//		int ducatiSpeed = ducati.getSpeed();
//		ducatiSpeed = ducatiSpeed + 100;
//		ducati.setSpeed(ducatiSpeed);
//		
//		honda.setSpeed(145);
//		int hondaSpeed = honda.getSpeed();
//		hondaSpeed = hondaSpeed + 100;
//		honda.setSpeed(hondaSpeed);
		ducati.decreaseSpeed(10015);
		System.out.println("Speed Decreases : " + ducati.getSpeed());

	}
}
