package repeat;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);

		
		System.out.print("프로그래밍 기초 :");
		int first = sc.nextInt();
		
		System.out.print("데이터베이스 :");
		int sec = sc.nextInt();
		
		System.out.print("화면구현 :");
		int third = sc.nextInt();
		
		System.out.print("애플리케이션 구현 :");
		int fourth = sc.nextInt();
		
		System.out.print("머신러닝 :");
		int fifth = sc.nextInt();
		
		double sum = fifth+first+sec+fourth+third;
		double avg = sum/5; 
		char grade=' ';
		 
		if(avg>=90) {
			grade = 'A';
		}else if(avg>=80 && avg <90) {
			grade = 'B';
		}else if(avg>=70 && avg <80) {
			grade = 'C';
		}else if(avg>=60 && avg <70) {
			grade = 'D';
		}else if(avg>=50 && avg <60) {
			grade = 'F';
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("학점: " + grade);
	}

}
