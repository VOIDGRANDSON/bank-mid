public class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " deposited " + amount + ". Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(owner + " withdrew " + amount + ". Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for " + owner);
        }
    }

    public double calculateInterest() {
        return 0;
    }
}
