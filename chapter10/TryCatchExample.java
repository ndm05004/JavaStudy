package chapter10;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("실행 시작");
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("패키지명이나 클래스 이름이 올바르지 않습니다.");
		} finally {
			System.out.println("실행 끝");			
		}

	}

}
