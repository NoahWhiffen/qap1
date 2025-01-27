// QAP 1 - Term 3 - Java
// Author: Noah Whiffen - SD12
// Date: January 27th, 2025


public class Account {
    int id;
    String name;
    double balance;


    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double credit(double amount) {
        balance += amount;
        return balance;
    }

    public double debit(double amount) {
        if (amount <= balance) {
            balance =  balance - amount;
            return balance;
        } else {
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }

    public void transferTo(Account other, double amount) {
        if (amount <= balance) {
            this.debit(amount); // Perform debit function to withdraw from other account.
            other.credit(amount); // Deposits into the other account.
            System.out.println("Transferred " + amount + " to " + other.getName());
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    public String toString() {
        return "Account: " + " id: " + id + " Name: " + name + " Balance: $" + balance;
    }
}
