package Bank_management;

public class GetDeatils {
	 String getDetails(BankAccount b1) {

	        return "Account No: " + b1.getAccNo()
	                + "\nAccount Holder Name: " + b1.getAccHolder()
	                + "\nCurrent Balance: " + b1.getCurrBalance();
}
}