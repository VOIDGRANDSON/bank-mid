public class Bank {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("Kebede", 8840, 0.15);
        Account acc2 = new CheckingAccount("Abebe", 500, 200);

        acc1.deposit(200);

        acc2.withdraw(600);
        acc2.withdraw(200);

        System.out.println(acc1.getOwner() + " interest: " + acc1.calculateInterest());
        System.out.println(acc2.getOwner() + " interest: " + acc2.calculateInterest());
    }
}
