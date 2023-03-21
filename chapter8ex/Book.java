package chapter8ex;

import java.util.Objects;

public abstract class Book {
	
	private int number;
	private String title;
	private String author;
	private static int countOfBooks;
	
	public Book(String title, String author) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.author = author;
		countOfBooks++;
		number = countOfBooks;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}



	
	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}


	abstract public int getLateFee(int lateDays);


	@Override
	public String toString() {
		return "관리번호"+getNumber() + "번, 제목: " + title + ", 작가: " + author + "(일주일 연체료: "+getLateFee(7)+")";
	}


}
