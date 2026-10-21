public class BankTest {
    public static void main(String[] args) {
        // Because we are in the default package, we use fully qualified names 
        // instead of import statements.
        banking.BankAccount myAccount = new banking.BankAccount(1001, 501, "Checking", 1500.00);

        System.out.println("--- BankAccount Access Test (from Root) ---");
        System.out.println("Public account_num: " + myAccount.account_num); // Allowed

        // COMPILE ERRORS IF UNCOMMENTED (Root is outside the 'banking' package):
        // System.out.println(myAccount.customerID);   // Package-private: NOT allowed
        // System.out.println(myAccount.account_type); // Protected: NOT allowed

        System.out.println("Private balance (via getter): " + myAccount.getBalance());

        System.out.println("\n--- SavingsAccount Subclass Test ---");
        banking.savings.SavingsAccount savings = new banking.savings.SavingsAccount(2002, 502, 3000.00, 2.5);
        savings.displayInfo();
    }
}