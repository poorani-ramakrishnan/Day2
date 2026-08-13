package Bank_management;

public class BankAccount {
	private long accNo;
	private String accHolder;
	private double currBalance;
	public BankAccount(long accNo, String accHolder, double currBalance) {
		super();
		this.accNo = accNo;
		this.accHolder = accHolder;
		this.currBalance = currBalance;
		
		
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public double getCurrBalance() {
		return currBalance;
	}
	public void setCurrBalance(double currBalance) {
		this.currBalance = currBalance;
	}
	
}
