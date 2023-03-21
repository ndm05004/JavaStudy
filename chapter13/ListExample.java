package chapter13;

import java.util.List;

import chapter06.package1.B;

public final class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for (Board board : list) {
			System.out.println(board.getTitle() +"-"+board.content);
		}
	}

}
