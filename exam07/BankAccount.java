package exam07;

public class BankAccount {

	private int balance;
	
	public BankAccount(int balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	
	public int deposit(int amount) {
		return balance+amount;
	}
	
	boolean withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			return true;
		}else {
			return false;
		}
	}
	
	boolean transfer(int amount, BankAccount otherAccount) {
		
		if(withdraw(amount)) {
			otherAccount.balance+=amount;
			balance -= amount;
			return true;
		}else {
			return false;
		}

	}
}

					 