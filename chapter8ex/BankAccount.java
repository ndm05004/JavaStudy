package chapter8ex;
public abstract class BankAccount {

	   protected int balance;

	   abstract String getAccountType();

	   public BankAccount(int balance) {
	      // TODO Auto-generated constructor stub
	      this.balance = balance;
	   }

	   public int getBalance() {
	      return balance;
	   }

	   public void deposit(int amount) {
	      balance += amount;
	   }

	   public boolean withdraw(int amount) {
	      if (balance >= amount) {
	         balance -= amount;
	         return true;
	      } else {
	         return false;
	      }
	   }

	   public boolean transfer(int amount, BankAccount otherAccount) {
	   
	      if (amount < 0 || amount > balance) {
	         throw new IllegalArgumentException();
	      }
	      if (otherAccount == null) {
	         throw new NullPointerException();
	      }
	      if (withdraw(amount)) {
	         otherAccount.deposit(amount);
	         return true;
	      }
	      return false;
	   }

	   @Override
	   public String toString() {

	      return "잔액: " + balance;

	   }
	}