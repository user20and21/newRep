
public class Car {

	public void fullThrottle() {
		System.out.println("This car is going fast!");
	}
	
	public void speed (int maxSpeed) {
		System.out.println("Max speed is " + maxSpeed + ".");
		//This is the only line that will change
		System.out.println("Changed.");
		//Does this show up in the working branch?
		System.out.println("Only for working branch.");
		
	}
}
