package exam07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Shaest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(1.0);
		shapes[1] = new Triangle(2.0);
		shapes[2] = new Rectangle(2.0, 3.0);
		for(Shape shape : shapes) {
			System.out.println(shape);
		}
		
		
		Arrays.sort(shapes);
		
		for(Shape shape : shapes) {
			System.out.println(shape);
		}
	}

}
