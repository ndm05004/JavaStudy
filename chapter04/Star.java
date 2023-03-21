package chapter04;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");

		
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
		
		   Scanner sc = new Scanner(System.in);
		      System.out.println("가위 바위 보 게임");
		      System.out.println("철수:");
		      String iron = sc.nextLine();
		      System.out.println("영희");
		      String zero = sc.nextLine();
		      String result = ""; 
		      if (iron.equals(zero)) {
		         result = "무승부!";
		      } else if (iron.equals("가위") && zero.equals("보")
		            || iron.equals("주먹") && zero.equals("가위")
		            || iron.equals("보") && zero.equals("주먹")) {
		    	  result = "영희 승리!";
		      } else {
		         result = "철수 승리!";}
		      
		      System.out.println("결과: " + result);
		      sc.close();		
		
}
}