package memo;

import java.util.List;

public class MemoService {
	
	private MemoDAO dao = new MemoDAO();
	
	public List<MemoVO> selectMemos(String searchWord) throws Exception{	
		return dao.selectMemos(searchWord);
	}
	
	// 상세 메모 조회
	public MemoVO selectMemo(int searchNo) {
		return dao.selectMemo(searchNo);
	}	
	// 메모 등록
	public int insertMemo(MemoVO vo) throws Exception {
		return dao.insertMemo(vo);	
	}
	
	// 메모 수정
	public int updateMemo(MemoVO vo) {
		return dao.updateMemo(vo);
	}
		
	// 메모 삭제
	public int deleteMemo(MemoVO deleteNo) {
		return dao.deleteMemo(deleteNo);
	}

}
