package chapter07;

public class Cat extends Animal {
	
	public Cat() {
		// TODO Auto-generated constructor stub
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}

}
