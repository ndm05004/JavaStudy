package exam07;

public class Triangle extends Shape {

	private double side;
	
	public Triangle(double side) {
		// TODO Auto-generated constructor stub
		this.side=side;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (Math.sqrt(3)/4)*this.side*this.side;

	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.side*3;
	}
	
	
	public String toString() {
		return "도형의 종류 삼각형 둘레: " + area() + ", 넓이: " + perimeter();
	}
}
