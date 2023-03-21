package chapter04;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random(); 
		
		while(true) {
			
			int first = ran.nextInt(6)+1;
			int second = ran.nextInt(6)+1;
			
			if(first + second !=5) {
				continue;
			}else {
				System.out.printf("(%d, %d)", first, second);
				break;
			}
		}
	}

}
