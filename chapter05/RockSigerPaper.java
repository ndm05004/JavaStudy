package chapter05;

import java.util.Random;
import java.util.Scanner;

public class RockSigerPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위 바위 보를 입력하세요");
		System.out.println("게이머: ");
		
		String select = sc.nextLine();
		int selectInt = 0;
		
		if(select.equals("보")) {
			selectInt= 1;
		}else if(select.equals("가위")) {
			selectInt= 2;
		}else if(select.equals("바위")) {
			selectInt= 3;
		}
		
		
		
		Random rand = new Random();
		
		int computerSelect = rand.nextInt(3)+1;

		
		if(computerSelect == 1) {
			System.out.println("인공지능 컴퓨터: 보");

		}else if(computerSelect == 2) {
			System.out.println("인공지능 컴퓨터: 가위");

		}else if(computerSelect == 3) {
			System.out.println("인공지능 컴퓨터: 바위");

		}
		
		
		if(computerSelect == selectInt) {
			System.out.println("결과: 비겼습니다.");
		}else if(computerSelect==1 && selectInt==2 || 
				computerSelect==2 && selectInt==3 ||
				computerSelect==3 && selectInt==1) {
			System.out.println("결과: 게이머 승리");
			
		}else {
			System.out.println("결과: 컴퓨터 승리");
		}
	
	}

}
