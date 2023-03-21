package memo;

import java.sql.Timestamp;

// VO: Value Object 값을 저장하는 객체
// VO에는 테이블단위로 만드는 것이 아니라 보여줄 데이터 단위가 되어야 함(ex join)
// DTO: Data Transfer Object 저장된 값을 전달하는 객체
// Bean: 자바가 커피원두에서 따온 이름에서 비롯되 객체를 Bean으로 표현하기도 함
// Model: 데이터와 관련된 객체를 Model이라고 부르기도 함
// Item: 각각의 데이터를 표현하는 의미로 아이템이라고 부르기도 함
// JavaBeans 패턴 vs Builder 패턴
// 객체 선언 도구 이용 => Lombok이 boilderplate code를 없애는 역할을 함

// javabeans 패턴 생성자-getter,setter 생성
public class MemoVO {
	
	private int no;
	private String title;
	private String content;
	private String writer;
	private Timestamp registerDate; //자바의 date는 날짜만 갖고 있기 때문에 Timestamp를 통해 시간,분,초까지 표현
	private Timestamp modifyDate;
	
	// insert 할 때 사용
	public MemoVO(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
    
	// select 할 때 사용
	public MemoVO(int no, String title, String content, String writer, Timestamp registerDate, Timestamp modifyDate) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.registerDate = registerDate;
		this.modifyDate = modifyDate;
	}
	
	// update 할 때 사용
	public MemoVO(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}

	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the writer
	 */
	public String getWriter() {
		return writer;
	}

	/**
	 * @param writer the writer to set
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}

	/**
	 * @return the registerDate
	 */
	public Timestamp getRegisterDate() {
		return registerDate;
	}

	/**
	 * @param registerDate the registerDate to set
	 */
	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}

	/**
	 * @return the modifyDate
	 */
	public Timestamp getModifyDate() {
		return modifyDate;
	}

	/**
	 * @param modifyDate the modifyDate to set
	 */
	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\t%s\t%s\t\n", no, title, content, writer, registerDate, modifyDate );
	}
	
	
	
	
	
	
}