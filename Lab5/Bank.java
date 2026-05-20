public class Bank {
    private Account[] accounts;

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    public void update() {
        for (Account a : accounts) {
            if (a instanceof SavingAccount) {
                ((SavingAccount) a).addInterest();
            } else if (a instanceof CurrentAccount) {
                CurrentAccount ca = (CurrentAccount) a;
                if (ca.isOverdraft()) {
                    System.out.println("Letter sent to account "
                        + a.getAccountNumber() + ": You are in overdraft.");
                }
            }
        }
    }
}
