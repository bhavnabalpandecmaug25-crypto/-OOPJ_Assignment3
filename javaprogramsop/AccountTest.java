class Account {
    protected int accountNo;
    protected double balance;

    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
}

class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    public void display() {
        System.out.println("Saving → " + accountNo + ", Balance=" + balance + ", Interest=" + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void display() {
        System.out.println("Current → " + accountNo + ", Balance=" + balance + ", Overdraft=" + overdraftLimit);
    }
}

public class AccountTest {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(101, 5000, 5);
        CurrentAccount c = new CurrentAccount(102, 10000, 2000);
        s.display();
        c.display();
    }
}