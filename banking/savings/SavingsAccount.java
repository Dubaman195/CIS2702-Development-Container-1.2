package banking.savings;

import banking.BankAccount;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int account_num, int customerID, double balance, double interestRate) {
        super(account_num, customerID, "Savings", balance);
        this.interestRate = interestRate;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + account_num); // PUBLIC: Allowed
        System.out.println("Account Type: " + account_type);     // PROTECTED: Allowed in subclass
        
        // COMPILE ERROR: customerID is package-private. 
        // Even though it's a subclass, 'banking.savings' is a different package than 'banking'.
        // System.out.println(customerID); 

        System.out.println("Balance: " + getBalance());         // PRIVATE: Via getter
    }
}