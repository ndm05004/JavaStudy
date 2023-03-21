package chapter02;

import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 개수: ");
		int fiveHund=sc.nextInt();
		
		System.out.print("100원짜리 동전의 개수: ");
		int oneHund=sc.nextInt();
		
		System.out.print("50원짜리 동전의 개수: ");
		int fift=sc.nextInt();
		
		System.out.print("10원짜리 동전의 개수: ");
		int ten=sc.nextInt();
		
		int resultMoney= 500*fiveHund + 100*oneHund + fift*50 + ten * 10;
		
		System.out.println("저금통 안의 동전의 총 액수: "+resultMoney);
	}

}
