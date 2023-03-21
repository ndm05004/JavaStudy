package chapter04;

public class ThreeMultiple {
	public static void main(String[] args) {
		
		int result=0;
		
		for(int i=0; i<=100; i++) {
			if(i%3==0) {
				result+=i;
			}
		}
		System.out.println(result);
	}
}
