package exam07;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle(double widht, double height) {
		// TODO Auto-generated constructor stub
		this.height=height;
		this.width=widht;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}
	
	 @Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (this.height+this.width)*2;

	}

	@Override
	public String toString() {
		return "도형의 종류 사각형 둘레: " + area() + ", 넓이: " + perimeter();
	}
}