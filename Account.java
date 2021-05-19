class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    
    public void deposit (double deposit) {
        if (deposit < 0) {
            System.out.println("Negative deposits are not accepted");
        } else {
            this.balance += deposit;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("The amount exceeds the balance");
        } else if (amount < 0) {
            System.out.println("Negative withdrawals are not accepted");
        } else {
            balance -= amount;
        }
    }

    public void transfer(Account account, double transferAmount) {
        if (transferAmount > this.getBalance()) {
            System.out.println("The amount exceeds the balance");
        } else if (transferAmount < 0) {
            System.out.println("Negative transfer amounts are not accepted");
        } else {
        this.balance -= transferAmount;
        account.deposit(transferAmount);
        }
    }
}