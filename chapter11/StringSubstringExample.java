package chapter11;

public class StringSubstringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		String seconNum = ssn.substring(7);
		
		System.out.println(firstNum);
		System.out.println(seconNum);
	}

}
