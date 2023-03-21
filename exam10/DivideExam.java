package exam10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("어떤 수를 나누시겠습니다?>> ");
				int val1 = sc.nextInt();
				System.out.print("어떤 수를 나누시겠습니다?>> ");
				int val2 = sc.nextInt();
				
				int result =val1/val2;
				System.out.println(val1+""+"/"+val2+" = "+result);
				sc.close();
				break;
				
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			} catch (ArithmeticException  e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}
		}	

	}

}
