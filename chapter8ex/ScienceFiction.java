package chapter8ex;

public class ScienceFiction extends Book{

	public ScienceFiction(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getLateFee(int lateDays) {
		
		return lateDays*600;
	}

}
