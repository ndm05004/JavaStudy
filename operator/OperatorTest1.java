package operator;

import java.util.Scanner;

public class OperatorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int firstNum = sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요: ");
		int secNum = sc.nextInt();
		
		
		int bigNum = ((firstNum + secNum) + Math.abs(firstNum-secNum))/2;
		
		int smallNum = ((firstNum + secNum) - Math.abs(firstNum-secNum))/2;

		
		System.out.printf("큰 수를 작은 수로 나눈 몫은 %d이고, 나머지는 %d이다.",
				bigNum/smallNum, bigNum%smallNum);
	}

}
