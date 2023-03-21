package chapter05;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();

		int count[] = new int[6];
		
		for(int i=0; i<10000; i++) {		
			int num = rand.nextInt(6)+1;
			if(num == 1) {
				count[0]++;
			}else if(num == 2) {
				count[1]++;
			}else if(num == 3) {
				count[2]++;
			}else if(num == 4) {
				count[3]++;
			}else if(num == 5) {
				count[4]++;
			}else if(num == 6) {
				count[5]++;
			}
			
		}
		
		System.out.println("-------------");
		System.out.println("면       빈도");
		System.out.println("-------------");
		
		for(int i=0; i<count.length; i++) {
			System.out.printf("%d        %d", i+1, count[i]);
			System.out.println(" ");
		}
		
	}

}



