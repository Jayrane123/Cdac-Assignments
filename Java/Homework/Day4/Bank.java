class Bank {
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Bank a = new Bank();
        a.deposit(100000);
        a.withdraw(2000);
        a.checkBalance();
    }
}