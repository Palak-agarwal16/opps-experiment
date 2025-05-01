public class BankDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(1000);
        acc.withdraw(300);
        acc.displayBalance();
    }
}