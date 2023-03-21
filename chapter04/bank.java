package chapter04;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int balance =0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------------");
			System.out.println("선택> ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("예금액>");
				int save = sc.nextInt();
				balance+=save;
				
			} else if(select == 2) {
				System.out.print("출금액>");
				int minus = sc.nextInt();
				balance-=minus;
				
			} else if(select == 3) {
				System.out.println("잔고> "+balance);

			} else if(select == 4) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
