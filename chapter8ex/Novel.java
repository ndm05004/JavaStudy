package chapter8ex;

public class Novel extends Book {
	
	public Novel(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int getLateFee(int lateDays) {
		
		return lateDays*300;
	}
	

}
