// QAP 1 - Term 3 - Java
// Author: Noah Whiffen - SD12
// Date: January 27th, 2025

package Account;
public class Account {
    int id;
    String name;
    double balance;


        // Constructor to initialize account with ID, name, and balance
    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter for the account ID
    public int getID() {
        return id;
    }

    // Getter for the account holder's name
    public String getName() {
        return name;
    }

    // Getter for the account balance
    public double getBalance() {
        return balance;
    }

    // Adds a specified amount to the account balance
    public double credit(double amount) {
        balance += amount;
        return balance;
    }

    // Subtracts a specified amount from the account balance (if sufficient funds are available)
    public double debit(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            return balance;
        } else {
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }

    // Transfers a specified amount from this account to another account
    public void transferTo(Account other, double amount) {
        if (amount <= balance) {
            this.debit(amount); // Perform debit function to withdraw from this account
            other.credit(amount); // Deposits into the other account
            System.out.println("Transferred " + amount + " to " + other.getName());
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Returns a string representation of the account details
    public String toString() {
        return "Account: " + " id: " + id + " Name: " + name + " Balance: $" + balance;
    }
}
