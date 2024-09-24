package Bank;

public class BankAccountVO {
	private String accountNo;   // 계좌번호
	private int balance;		// 잔액
	
	//setter / getter
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountNo() {
		return this.accountNo;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	// 일반메소드 deposit(): 입금, withdraw(): 출금
	public void deposit(int money) {
		this.balance += money;
	}
	
	public int withdraw(int money) {
		if (this.balance < money) {
			return -1;
		}
		this.balance -= money;
		return money;
	}
}
