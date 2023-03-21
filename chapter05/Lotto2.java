package chapter05;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();

		int[] num = new int[46];
		
		for(int i=1; i<num.length; i++ ) {
			num[i] = i;
			
		}

		
		for(int i=1; i<num.length; i++) {
			int rNum2 = rand.nextInt(45)+1;
			//int rNum3 = rand.nextInt(45)+1;
			
			int temp =0;
			temp = num[rNum2];
			num[rNum2] = num[i];
			num[i] = temp;
						
			System.out.print(num[i]+" ");
		}
		System.out.println(" ");
		
		for(int i=1; i<7; i++ ) {
			if(i!=1) {
				System.out.print(",");
			}
			System.out.print(num[i]);
			
			
		}
		
			
	}

}
