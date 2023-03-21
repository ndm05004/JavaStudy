package chapter10;

public class ThrowsExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		method();

		// 예외 발생시키기 => 예외를 만든다
		// throw 사용
		
		throw new Exception();
		
		
	}
	
	public static void method() throws ClassNotFoundException {
		Class.forName("java.Iang.String");
	}

}
