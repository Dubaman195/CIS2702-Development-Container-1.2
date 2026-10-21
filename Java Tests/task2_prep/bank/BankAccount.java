// Access Control:
//  - private -> same class
//  - package-private (no modifier) -> same class and same package
//  - protected -> same class, same package and in subclasses
//  - public -> anywhere
// These should be used in order to try and protect data that doesn't need to be displayed depending on circumstance.

// Define Class
// The main public class (must match file name BankAccount.java)

public class BankAccount {
    private double balance;
    protected String account_type;
    int customerID;
    public int account_num;

    public BankAccount(int account_num, int customerID, String account_type, double balance) {
        this.account_num = account_num;
        this.customerID = customerID;
        this.account_type = account_type;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

// A separate top-level subclass in the same file (package-private)
class SavingsAccount extends BankAccount {
    
}
