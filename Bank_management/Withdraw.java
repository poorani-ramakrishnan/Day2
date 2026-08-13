package Bank_management;

public class Withdraw {
	    boolean withdraw(BankAccount b1, double amount) {
	        double balance = b1.getCurrBalance();
	        if (amount > 0 && amount <= balance) {
	            balance = balance - amount;
	            b1.setCurrBalance(balance);
	            return true;
	        }
	        return false;
	    }
	}

