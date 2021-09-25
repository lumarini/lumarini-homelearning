package firstproject;

public class Cars {
	
	//Attributes for objects on class Car: 
	int numOfWheels = 4; 
	int numOfDoors;
	String color;
	boolean isConvertible;
	int numOfPassengers;
	
	
	//Constructor method
	public Cars(int doors, String carColor) {
		numOfDoors = doors;
		color = carColor;
	}

	//Methods for objects on class Car:
	public void currentSpeed(int speed) {
		System.out.println("The car is going at "+speed+" miles per hour");
	}
	
	public void moveForward(int speed, int time) {
		System.out.println("Move forward");
	}

	public void turnLeft() {
		System.out.println("Turn left");
	}

	
	public void park(String parkingSpot) {
		System.out.println("Park the car on "+parkingSpot);
	}
	

}
