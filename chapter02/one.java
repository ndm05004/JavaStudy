package chapter02;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로의 길이는?(단위: m): ");
		double width = sc.nextDouble();
		
		System.out.print("세로의 길이는?(단위: m): ");
		double heght = sc.nextDouble();
		
		
		
		double area = width * heght;
		
		double perimeter = (heght + width) * 2;
		
		System.out.println("직사각형의 넓이: "+area);
		
		System.out.println("직사각형의 둘레: "+perimeter);
		
	}

}
