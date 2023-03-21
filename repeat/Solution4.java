package repeat;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String chulsu = sc.nextLine();

		System.out.print("영희: ");
		String yonghee = sc.nextLine();
		
		String result = " ";
		
		if (chulsu.equals(yonghee)) {
			result = "무승부";
 
				
		} else if (chulsu.equals("바위") && yonghee.equals("보") 
				|| chulsu.equals("가위") && yonghee.equals("바위")
				|| chulsu.equals("보") && yonghee.equals("가위")) {
			result = "영희 승리";
			
		} else {
			result = "철수 승리";

		}
		System.out.println("결과: "+result);
	}
}
