package chapter02;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "김자바";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		
		System.out.println("이름: "+ name);
		System.out.println("나이"+ age);
		System.out.println("전화: " +tel1+"-"+tel2+"-"+tel3);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수:");
		String strnum1 = sc.nextLine();
		
		System.out.println("두번째 수:");
		String strnum2 = sc.nextLine();
		
		
		int num1= Integer.parseInt(strnum1);
		
		int num2= Integer.parseInt(strnum2);
		
		int result = num1 +num2;
		System.out.println("덧셈결과:" +result);
	
		
		System.out.println("[필수 정보 입력]");
		System.out.println("1. 이름: ____________");
		String str1 = sc.nextLine();
	
		System.out.println("2. 주민번호 앞 6자리: ____________");
		String str2 = sc.nextLine();
		
		System.out.println("3. 전화번호: ____________");
		String str3 = sc.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
