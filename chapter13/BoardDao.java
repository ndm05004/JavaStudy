package chapter13;

import java.util.List;
import java.util.ArrayList;

public class BoardDao {
	
	public List<Board> getBoardList() {
		
		List<Board> boardList = new ArrayList<Board>();
		
		boardList.add(new Board("제목1","내용1"));
		boardList.add(new Board("제목2","내용2"));
		boardList.add(new Board("제목3","내용3"));
		
		return boardList;
	}

}
