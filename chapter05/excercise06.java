package chapter05;

import java.util.Scanner;

public class excercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수 리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수 >");
				scores = new int[sc.nextInt()];
			}else if(selectNo == 2) {
				for(int i=0; i< scores.length; i++) {
					System.out.printf("scores[%d] >",i);
					scores[i] = sc.nextInt();
				}
				
			}else if(selectNo == 3) {
				for(int i=0; i< scores.length; i++) {
					System.out.printf("scores[%d] >", scores[i]);
					System.out.println();
				}
				
			}else if(selectNo == 4) {
				
				int max=0; 
				double avg =0.0;
				int sum=0;
				
				for(int i=0; i< scores.length; i++) {
					sum = scores[i];
					
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				avg = sum/3;
				
				System.out.println("최고 점수 :" + max);
				System.out.println("평균 점수 :" + avg);
				
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}