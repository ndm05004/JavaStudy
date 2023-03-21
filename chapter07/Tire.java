package chapter07;

public class Tire {
	
	public int maxRoltation;
	public int accumulatedRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRoltation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRoltation) {
			System.out.println(location + " Tire 수명: "+ (maxRoltation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** "+ location+ " Tire 펑크***");
			return false;
		}
	}

}
