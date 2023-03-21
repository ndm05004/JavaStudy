package exam07;

public abstract class Shape implements Comparable<Shape> {
	
	abstract public double area();
	
	abstract public double perimeter();
	
	@Override
	public int compareTo(Shape o) {
		
		if(area() > o.area()) {
			return 1;
		}else if(area() == o.area()) {
			return 0;
		}else {
			return -1;
		}
	
	}

	@Override
	public String toString() {
		return Math.round(area()*100)/100.0  + ", 넓이: " + Math.round(perimeter()*100)/100.0;
		

	}
	

}
