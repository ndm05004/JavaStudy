package chapter8ex;
public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts;

	public Customer(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}

	public BankAccount getAccount(int index) {
		return accounts[index];
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void addAccount(BankAccount account) {
		this.accounts[numberOfAccounts] = account;
		numberOfAccounts++;
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	@Override
	public String toString() {
		return "이름: " + firstName + lastName + ", 계좌의 갯수: " + numberOfAccounts;
	}

}
