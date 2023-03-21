package chapter8ex;
public class SavingsAccount extends BankAccount {

	private double interestRate;

	public SavingsAccount(int balance, double interestRate) {
// TODO Auto-generated constructor stub
		super(balance);
		this.interestRate = interestRate;
	}

	public void updateBalance(int period) {
		balance += balance * interestRate * period;
	}

	@Override
	String getAccountType() {
		// TODO Auto-generated method stub
		return "저축예금";
	}

}
