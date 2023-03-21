package chapter04;

import java.util.Scanner;

public class star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();
		
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");

				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		

	}

}
