package chapter07;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation) {
		// TODO Auto-generated constructor stub
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulatedRotation;
		if(accumulatedRotation<maxRoltation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRoltation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** "+ location + " KumhoTire 펑크 ***");
			return false;
		}
		
	}

}
