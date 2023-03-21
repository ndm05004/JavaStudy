package chapter11;

public class StringTrimExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String te1= "  02";
		String te2= "123   ";
		String te3= "  1234  ";
		
		String tel = te1.trim() + te2.trim() + te3.trim();
		System.out.println(tel);
	}

}
