class BankAccount {
    private String customerName;
    private String accountNumber;    private double balance;
    // Set customer name
    public void setCustomerName(String name) {
        customerName = name;
    }
    // Set account number
    public void setAccountNumber(String accNo) {
        accountNumber = accNo;
    }
    // Deposit money (only positive amounts)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }
    // Withdraw money (only if enough balance)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Error: Insufficient balance or invalid amount.");
        }
    }
    // Display account info
    public void displayAccountInfo() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Account No.: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
    }
}
public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setCustomerName("Ali Raza");
        account.setAccountNumber("ACC12345");
        account.deposit(1000);  // Valid deposit
        account.withdraw(300);  // Valid withdrawal
        account.withdraw(800);  // Fails (insufficient balance)
        account.displayAccountInfo();
    }
}