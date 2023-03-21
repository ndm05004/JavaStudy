package exam07;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	
	@Override
	public double area() {

		return this.radius*this.radius*Math.PI;	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
	
		return this.radius*2*Math.PI;
	}
	
	

	public String toString() {
		return  "도형의 종류 원 둘레: " + super.toString();
		
		
	}
}
