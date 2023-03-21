package chapter8ex;
public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
// TODO Auto-generated constructor stub
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	@Override
	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		if (balance + protectedBy.balance < amount) {
			throw new IllegalArgumentException();
		} else if (balance <= amount) {
			protectedBy.withdraw(amount - balance);
			balance -= amount;
			return true;
		} else {
			super.withdraw(amount);
			return true;
		}
	}

	@Override
	String getAccountType() {
		// TODO Auto-generated method stub
		return "당좌예금";
	}

}