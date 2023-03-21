package chapter05;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int[] num = new int[6];
		
		for(int i=0; i<num.length; i++ ) {
			num[i] = rand.nextInt(45)+1;
			
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
			

			System.out.print(num[i]+" ");
		}
		
		
	}

}
