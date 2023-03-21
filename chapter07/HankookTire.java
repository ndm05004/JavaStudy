package chapter07;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulatedRotation;
		if(accumulatedRotation<maxRoltation) {
			System.out.println(location + " HankookTire 수명:" + (maxRoltation-accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** "+ location + " HankookTire 펑크***");
			return false;
		}
	}

}
