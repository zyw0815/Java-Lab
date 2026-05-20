public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accnum, double overdraftLimit) {
        super(accnum);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double sum) {
        if (sum > 0 && getBalance() - sum < -overdraftLimit) {
            System.out.println("Error: Overdraft limit exceeded. "
                + "Balance: " + getBalance()
                + ", Withdraw: " + sum
                + ", Limit: " + overdraftLimit);
        } else {
            super.withdraw(sum);
        }
    }

    public double getOverdraftLimit() { return overdraftLimit; }
    public boolean isOverdraft() { return getBalance() < 0; }
}
