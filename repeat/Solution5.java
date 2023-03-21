package repeat;

import java.util.Random;
import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int computer = rand.nextInt(100)+1;
		int count =1;
		while(true) {
			
			
			System.out.println("1부터 100 사이의 정수 중 하나를 선택하세요: ");
		
			int human = sc.nextInt();
			
			if(computer < human) {
				System.out.println("정답은 더 큰 작은 수 입니다.");
			}else if(computer > human) {
				System.out.println("정답은 더 큰 수 입니다.");
			}else if(computer == human) {
				System.out.println("정답입니다.");
				break;
			}
			count ++;
			
		}
		System.out.println("게임을 종료합니다.");
		System.out.printf("%d번 만에 맞췄습니다.",count);
	} 
}