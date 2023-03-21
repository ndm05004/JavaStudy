package chapter02;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm)");
		
		double radius = sc.nextDouble();
			
		System.out.print("원기둥 높이를 입력하시오.(단위: cm)");
		
		double height = sc.nextDouble();
		
		double pi = 3.14;
		
		double understoolExtent = pi * radius * radius;
		
		double volume =understoolExtent*height;
		
		System.out.printf("원기둥 밑면의 넓이는 %fcm^2이고, "
				+ "원기둥의 부피는 %fcm^3이다.", understoolExtent, volume);
		
	}

}
