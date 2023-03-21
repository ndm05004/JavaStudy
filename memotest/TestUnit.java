package memotest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import memo.MemoDAO;
import memo.MemoVO;

class TestUnit {
	// TDD: Test Driven Development
	MemoDAO dao = new MemoDAO();

	
	 @Test 
	 void selectMemos() { 
		 try { 
			 List<MemoVO> list = dao.selectMemos("");
			 assertEquals(7, list.size()); 
		 } catch (Exception e) {
	   }
	}
	  
//	 @Test void selectMemo() {
//	 
//	 MemoVO memo = dao.selectMemo(0); assertNull(memo); }
//	 
//	 @Test void insertMemo() { try { int insertMemo = dao.insertMemo(new
//	 MemoVO("7번째 시간", "이제 2시간 남음", "a001")); assertEquals(1, insertMemo);
//	 List<MemoVO> list = dao.selectMemos(""); assertEquals(8, list.size()); }
//	 catch (Exception e) { e.printStackTrace(); } }
	 

}
