class BankAccount {
    
    private double balance;

    public BankAccount() {
        balance = 0.0;
    }
	
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
	
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
   
    public double getBalance() {
        return balance;
    }

    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);  
        account.withdraw(2000);  

        System.out.println("Updated Balance = " + account.getBalance());
    }
}