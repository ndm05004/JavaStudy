package chapter05;

public enum Week {
	MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), THURSDAY("못요일"), FRIDAY("금요일"), STRURDAY("토요일"), SUNDAY ("일요일");
	String korName;
	
	Week(String name){
		korName = name;
	}

}
