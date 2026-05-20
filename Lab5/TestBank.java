public class TestBank {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(1001, 0.05);
        sa.deposit(1000);
        System.out.println("SavingAccount before interest: " + sa.getBalance());
        sa.addInterest();
        System.out.println("SavingAccount after 5% interest: " + sa.getBalance());

        CurrentAccount ca = new CurrentAccount(2001, 5000);
        ca.deposit(1000);
        ca.withdraw(2000); // balance = -1000, within limit
        System.out.println("CurrentAccount balance: " + ca.getBalance());
        ca.withdraw(5000); // would exceed limit, error

        Account[] accounts = { sa, ca, new SavingAccount(1002, 0.03) };
        Bank bank = new Bank(accounts);
        bank.update();
    }
}
