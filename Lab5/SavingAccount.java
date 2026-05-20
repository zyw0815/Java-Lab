public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(int accnum, double rate) {
        super(accnum);
        interestRate = rate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    public double getInterestRate() { return interestRate; }
}
