package Bank;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Savings Account Demo ===");
        SavingsAccount savings = new SavingsAccount(1000.0);
        savings.displayBalance();
        savings.deposit(500);
        savings.addInterest();
        savings.displayBalance();

        System.out.println("\n=== Checking Account Demo ===");
        CheckingAccount checking = new CheckingAccount(500.0);
        checking.displayBalance();
        checking.withdraw(550); // within overdraft
        checking.displayBalance();
        checking.withdraw(200); // exceeds overdraft
    }
}

