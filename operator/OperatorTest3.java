package operator;

import java.util.Scanner;

public class OperatorTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("윤년인지를 확인할 연도를 입력하세요: ");
		int year = sc.nextInt();
		

		String annualReader =  (year % 4==0 && year % 100!=0 || year % 400==0) ? 
				"년은 윤년입니다" : "년은 윤년이 아닙니다";
		
		System.out.println(year+annualReader);
				
				
		
	}

}
