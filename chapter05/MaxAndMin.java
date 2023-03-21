package chapter05;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		
		int max = num[0];
		int min = 38;
		
		for(int i=0; i<num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
			if(num[i] <  min) {
				min = num[i];				
			}
				
		}
		System.out.println("최댓값 :" + max);
		System.out.println("최솟값 :" + min);
	}

}
