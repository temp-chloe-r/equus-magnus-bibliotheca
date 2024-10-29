package Banking_App;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create account objects
        CurrentAccount currentAccount1 = new CurrentAccount(100, "Alice", 500);
        CurrentAccount currentAccount2 = new CurrentAccount(200, "Bob", 1000);

        SavingsAccount savingsAccount1 = new SavingsAccount(50, "Charlie", 2.5);
        SavingsAccount savingsAccount2 = new SavingsAccount(100, "Dana", 3.0);

        currentAccount1.deposit(1000);
        currentAccount1.withdraw(200);

        currentAccount2.deposit(1500);
        currentAccount2.withdraw(500);

        savingsAccount1.deposit(800);
        savingsAccount2.deposit(1000);

        List<Object> accounts = new ArrayList<>();
        accounts.add(currentAccount1);
        accounts.add(currentAccount2);
        accounts.add(savingsAccount1);
        accounts.add(savingsAccount2);

        // Display account details
        for (Object account : accounts) {
            System.out.println(account.toString());
        }
    }
}