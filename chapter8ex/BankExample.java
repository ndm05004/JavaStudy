package chapter8ex;

public class BankExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckingAccount tonyAccount = new CheckingAccount(3000);
		CheckingAccount steaveAccount = new CheckingAccount(4000);

		
		try {
			tonyAccount.transfer(5000, steaveAccount);
			System.out.println("송금완료");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("해당하는 계좌가 없습니다.");
			System.out.println("송금실패");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("해당하는 금액을 보낼 수 없습니다.");
			System.out.println("송금실패");
		}
		try {
			tonyAccount.transfer(5000, null);
			System.out.println("송금완료");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("해당하는 계좌가 없습니다.");
			System.out.println("송금실패");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("해당하는 금액을 보낼 수 없습니다.");
			System.out.println("송금실패");
		}
		

	}

}
