package Assignments Lab 3;

// Define the BankAccount class
class BankAccount {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    // Constructor
    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    // Method to get current balance
    public double getBalance() {
        return accountBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println(amount + " deposited into " + bankName + " account of " + accountHolderName);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println(amount + " withdrawn from " + bankName + " account of " + accountHolderName);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }
}

// Main class to test the BankAccount class
public class BankApp {
    public static void main(String[] args) {
        // Create three bank account objects
        BankAccount account1 = new BankAccount("Alice", "ICICI", 1000.0);
        BankAccount account2 = new BankAccount("Bob", "HDFC", 1500.0);
        BankAccount account3 = new BankAccount("Charlie", "SBI", 2000.0);

        // Perform deposits and withdrawals
        account1.deposit(500);
        account1.withdraw(300);
        System.out.println("Balance for " + account1.bankName + " account: ₹" + account1.getBalance());

        account2.deposit(700);
        account2.withdraw(1200);
        System.out.println("Balance for " + account2.bankName + " account: ₹" + account2.getBalance());

        account3.deposit(400);
        account3.withdraw(2500); // This should trigger insufficient funds
        System.out.println("Balance for " + account3.bankName + " account: ₹" + account3.getBalance());
    }
}

