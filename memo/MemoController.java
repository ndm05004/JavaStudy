package memo;

import java.util.List;
import java.util.Scanner;

public class MemoController {
	
	private MemoService service = new MemoService();
	private MemoView view = new MemoView();
	
	public void selectMemos(String searchWord) throws Exception{	
		List<MemoVO> list = service.selectMemos(searchWord);
		view.printMemos(list);
	}
	
	// 상세 메모 조회
	public void selectMemo(Scanner scanner) {
		int searchNo = view.inputSelectNo(scanner);
		MemoVO memo =  service.selectMemo(searchNo);
		view.printMemo(memo);
	}	
	// 메모 등록
	public void insertMemo(Scanner scanner) throws Exception {
		MemoVO vo = view.inputInsertMemo(scanner);
		int insertMemo =  service.insertMemo(vo);	
		view.insertResult(insertMemo);
	}
	
	// 메모 수정
	public int updateMemo(MemoVO vo) {
		return service.updateMemo(vo);
	}
		
	// 메모 삭제
	public int deleteMemo(MemoVO deleteNo) {
		return service.deleteMemo(deleteNo);
	}

}
