package chapter07;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver driver = new Driver();
		
		Vehicle bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.dirve(bus);
		driver.dirve(taxi);

	}

}
