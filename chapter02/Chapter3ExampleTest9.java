package chapter02;

import java.util.Scanner;

public class Chapter3ExampleTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("9번");
		System.out.println("-------------------");

		//9
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int SecNum = sc.nextInt();
				
		if(SecNum == 0) {
			 System.out.println("결과: 무한대");
		}else {
			System.out.println("결과: "+ firstNum/SecNum);
		}
		System.out.println("");
		
	}

}
