package chapter10;

import java.util.Scanner;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try(Scanner sc = new Scanner(System.in)) { // try문 안에 넣을 시 자원반납을 알아서 해줌		

			int value1 = sc.nextInt();
			int value2 = sc.nextInt();

			int result = value1 + value2;
			System.out.println(result);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(" 실행 매개변수의 수가 부족합니다.");
			return;
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");

		}finally {
			System.out.println("다시 실행하세요.");
		} 
	
		
		
//			ctrl +/ 단일 주석
//		    ctrl +shift+/ 블록주석
	}
}