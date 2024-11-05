package ObjectOrientedProgramming;

public class MotorBike {
	private int speed;

	MotorBike(int speed) {
		this.speed = speed;
	}

	void start() {
		System.out.println("Broohm Brohm");
	}

	void stop() {
		System.out.println("Stopped");
	}

	void setSpeed(int speed) {
//		System.out.println(speed);//value of local variable speed
//		System.out.println(this.speed);// 0 because the instance variable is not initialize yet
		if (speed > 0)
		this.speed = speed;


	}

	void increaseSpeed(int howMuch) {
//		this.speed = this.speed + howMuch;
		setSpeed(this.speed + howMuch);


	}

	void decreaseSpeed(int howMuch) {
//		if (this.speed - howMuch > 0)
//		this.speed = this.speed - howMuch;
		setSpeed(this.speed - howMuch);


	}
	int getSpeed() {
		return this.speed;

	}
}
