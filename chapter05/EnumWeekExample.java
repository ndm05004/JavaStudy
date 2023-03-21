package chapter05;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 열거형은 싱글턴 형태로 객체를 만들어준다.
		
		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
		Week today = null;
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
			
		case 2:
			today = Week.MONDAY;
			break;
			
		case 3:
			today = Week.TUESDAY;
			break;
			
		case 4:
			today = Week.THURSDAY;
			break;
			
		case 5:
			today = Week.WEDNESDAY;
			break;
			
		case 6:
			today = Week.STRURDAY;
			break;
		
		case 7:
			today = Week.FRIDAY;
			break;
		}
		System.out.println("오늘 요일: "+ today.korName);
		
		if(today==Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}

}
