package Bank_management;

public class Deposit {
    void deposit(BankAccount b1, double amount) {
        if (amount > 0) {
            double balance = b1.getCurrBalance();
            balance = balance + amount;
            b1.setCurrBalance(balance);
        }
    }
}