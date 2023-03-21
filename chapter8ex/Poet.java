package chapter8ex;

public class Poet extends Book{

	public Poet(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getLateFee(int lateDays) {
		
		return lateDays*200;
	}


}
