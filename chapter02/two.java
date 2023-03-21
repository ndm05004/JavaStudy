package chapter02;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double distance = 40e12;
		
		double lightSpeed = 300000; 
		
		
		double time = (distance / lightSpeed)/365/24/60/60;
		
		System.out.printf("빛의 속도로 프록시마 센타우리 별까지 "
				+ "가는데 걸리는 시간은 %f 광년입니다",time);
		
	}

}
