package Bank;

class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass 1
class SavingsAccount extends BankAccount {
    private double interestRate = 0.05; // 5% interest

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

// Subclass 2
class CheckingAccount extends BankAccount {
    private double overdraftLimit = 100.0;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn (with overdraft): " + amount);
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount.");
        }
    }
}
