package chapter8ex;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] books = new Book[6];
		books[0] = new Novel("칼의노래","김훈");
		books[1] = new Novel("칼의노래","김훈");
		books[2] = new Novel("이상한 가역반응","이상");
		books[3] = new Novel("하늘과 바람과 별과 시","윤동주");
		books[4] = new Novel("유년기의 끝","아서");
		books[5] = new Novel("스페이스 오디세이","아서");
		
		for (Book book : books) {
			System.out.println(book);
		}
		
		System.out.println(books[0].equals(books[1]));
	}

}
