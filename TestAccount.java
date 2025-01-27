// QAP 1 - Term 3 - Java
// Author: Noah Whiffen - SD12
// Date: January 27th, 2025

public class TestAccount {
    
    public static void main(String[] args) {
        
        // Construct two new accounts.
        Account account_1 = new Account(1, "John Smith", 5000.00);
        Account account_2 = new Account(2, "Jane Smith", 4000.00);

        // Output account balances.
        System.out.println("Account 1 Balance: $" + account_1.getBalance());
        System.out.println("Account 2 Balance: $" + account_2.getBalance());
        System.out.println("-------------------------------------------");

        // Transfer $1000 from account 1 to account 2.
        account_1.transferTo(account_2, 1000);

        // Display balances after transfer.
        System.out.println("-------------------------------------------");
        System.out.println("Account 1 Balance: $" + account_1.getBalance());
        System.out.println("Account 2 Balance: $" + account_2.getBalance());
    }
}