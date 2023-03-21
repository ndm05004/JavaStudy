package chapter02;

import java.util.Scanner;

public class Chapter3ExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("11번");
		System.out.println("-------------------");
		//11
		System.out.println("아이디: ");
		String name = sc.nextLine();
		
		System.out.println("패스워드: ");
		String strPassword = sc.nextLine();
		
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패: 아이디가 존재하지 않음");
		}
		System.out.println("");
	}

}
