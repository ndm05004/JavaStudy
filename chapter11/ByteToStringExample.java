package chapter11;

public class ByteToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(bytes);
		System.out.println(str);
	}

}