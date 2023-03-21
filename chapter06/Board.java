package chapter06;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;

	public Board(String title, String content) {
		// TODO Auto-generated constructor stub
		this(title, content,"로그인한 회원아이디","현재 컴퓨터 날짜", 0);
	}
	
	public Board(String title, String content, String writer) {
		// TODO Auto-generated constructor stub
		this(title, content, writer,"현재 컴퓨터 날짜", 0);
	}
	
	public Board(String title, String content, String writer, String date) {
		// TODO Auto-generated constructor stub
		this(title, content,writer,date, 0);
	}
	
	public Board(String title, String content, String writer, String date, int hitcount) {
		
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}
