package chapter13;

import chapter10.Member;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<String> box= new Box<String>("1");
		Box<Member> box2 = new Box<Member>(new Member("1"));
		
		System.out.println(box2.getValue().id);
		
	}

}
