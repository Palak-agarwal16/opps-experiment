public class BankAccount {
    private double balance = 0.0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    protected void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        acc.withdraw(200);
        acc.checkBalance();

        // acc.balance = 100; // ❌ Not allowed: 'balance' is private
    }
}
