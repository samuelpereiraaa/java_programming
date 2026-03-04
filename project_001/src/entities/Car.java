package entities;

public class Car {

	public int speedModel;
	public boolean connected;

	public void accelerate() {
		if (connected) {
			this.speedModel += 10;
		} else {
			System.out.println("the car is turn off.");
		}
	}

	public void brake() {
		if (this.speedModel >= 10) {
			this.speedModel -= 10;
		} else {
			this.speedModel = 0;
			System.out.println("the car is stopped.");
		}
	}

	public String turnOn() {

		this.connected = true;
		return "Car turned on.";

	}

	public String turnOff() {
		if (this.speedModel == 0) {
			this.connected = false;
			return "Car turned off.";
		} else {
			return "the car is in movin";
		}
	}

}
