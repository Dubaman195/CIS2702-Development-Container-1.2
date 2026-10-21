package banking;

// Access Control:
//  - private -> same class
//  - package-private (no modifier) -> same class and same package
//  - protected -> same class, same package and in subclasses
//  - public -> anywhere
// These should be used in order to try and protect data that doesn't need to be displayed depending on circumstance.

// Define Class
// 1. The main public class

public class BankAccount {
    private double balance;          // private
    protected String account_type;   // protected
    int customerID;                  // package-private
    public int account_num;          // public

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