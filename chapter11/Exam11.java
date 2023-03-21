package chapter11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");

		String now = simple.format(date);
		
		System.out.println(now);
		
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%4d년 %02d월 %02d일 %s요일 %02d시 %02d분", year, month, day, week, hour, minute);
		
	}

}
