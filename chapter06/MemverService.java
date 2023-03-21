package chapter06;

public class MemverService {

	
	boolean login(String id, String password) {
	
	if("hong".equals(id) && "12345".equals(password)) { // 비교할 대상이 NULL일 수도 있기 때문에 변수를 equals의 대상이 된다.
		return true;
	} 
	return false;
} 
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}