package Banking_App;

public class CurrentAccount {
    double balance;
    double minBalance;
    String accountHolderName;
    double maxWithdraw;

    public CurrentAccount(double min, String name,double max) {
        this.balance = 0;
        this.minBalance = min;
        this.accountHolderName = name;
        this.maxWithdraw = max;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getMaxWithdraw() {
        return maxWithdraw;
    }

    public void setMaxWithdraw(double maxWithdraw) {
        this.maxWithdraw = maxWithdraw;
    }
}
