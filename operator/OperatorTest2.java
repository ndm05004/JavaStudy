package operator;

import java.util.Scanner;

public class OperatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("수도입니까? (수도:1, 수도아님: 0)");
		
		int capital = sc.nextInt();
		
		System.out.print("총 인구는?(단위: 만)");
		int population = sc.nextInt();
		
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만)");
		int annualIncome = sc.nextInt();

		
		String metropolice = ((capital ==1 && population >=100) ||annualIncome >= 50) ? "메트로폴리스" : "일반도시";
		
		System.out.printf("이 도시는 %s 입니다.",metropolice);
	}

}
