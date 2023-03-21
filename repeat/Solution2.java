package repeat;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요(1~12): ");
		int month = sc.nextInt();
				
		switch (month) {
		case 3: 
		case 4:
		case 5:	System.out.printf("%d월은 봄입니다.",month);

			break;
		case 6:
		case 7:
		case 8: System.out.printf("%d월은 여름입니다.",month);		

			break;
		case 9:
		case 10:
		case 11: System.out.printf("%d월은 가을입니다.",month);
			break;
		case 12:
		case 1:
		case 2:System.out.printf("%d월은 겨울입니다.",month);
			break;	
		default:
			System.out.printf("%d월은 잘못된 입력입니다.",month);
			break;
		} 
			
	}

}