package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		String dataString = date.toString();
		System.out.println(dataString);
		
		//format 변경 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E hh시 mm분 ss초 SSS");
		String strNow2 = sdf.format(date);
		System.out.println(strNow2);
		
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int mileSecond = calendar.get(Calendar.MILLISECOND);
		
		System.out.printf("%4d-%02d-%02d %02d:%02d:%02d.%02d", year, month, day, hour, minute, second, mileSecond);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//메소드체이닝 방식
		String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd E hh:mm:ss.SSS"));
		System.out.println(format);
		
	}

}
