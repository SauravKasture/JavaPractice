package ObjectOrientedProgramming;

public class MotorBike {
	private int speed;

	void start() {
		System.out.println("Broohm Brohm");
	}

	void stop() {
		System.out.println("Stopped");
	}

	void setSpeed(int speed) {
//		System.out.println(speed);//value of local variable speed
//		System.out.println(this.speed);// 0 because the instance variable is not initialize yet
		this.speed = speed;

	}

	int getSpeed() {
		return this.speed;
	}
}
