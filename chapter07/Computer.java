package chapter07;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle() 실행");
		super.areaCircle(r);
		return Math.PI*r*r;
	}
	
	

}
