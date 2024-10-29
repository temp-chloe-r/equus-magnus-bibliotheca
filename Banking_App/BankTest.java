package Banking_App;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {

    CurrentAccount currentAccount = new CurrentAccount(0, "Peter McNaughton", 250);
    SavingsAccount savingsAccount = new SavingsAccount(0, "Peter McNaughton", 0.05);

    @Test
    public void testDeposit(){
        assertEquals(currentAccount.getBalance(), 0.0, 0.01);
        assertEquals(savingsAccount.getBalance(), 0.0, 0.01);
        currentAccount.setBalance(100.0);
        savingsAccount.setBalance(100.0);
        assertEquals(currentAccount.getBalance(), 100.0, 0.01);
        assertEquals(savingsAccount.getBalance(), 100.0, 0.01);
        currentAccount.deposit(100);
        savingsAccount.deposit(100);
        assertEquals(currentAccount.getBalance(), 200.0, 0.01);
        assertEquals(savingsAccount.getBalance(), 200.0, 0.01);
    }

    @Test
    public void testWithdraw(){
        currentAccount.setBalance(100.0);
        savingsAccount.setBalance(100.0);
        assertEquals(currentAccount.getBalance(), 100.0, 0.01);
        assertEquals(savingsAccount.getBalance(), 100.0, 0.01);
        currentAccount.withdraw(50);
        savingsAccount.withdraw(50);
        assertEquals(currentAccount.getBalance(), 50, 0.01);
        assertEquals(savingsAccount.getBalance(), 50, 0.01);
    }

    @Test
    public void testMinBalance(){
        assertEquals(currentAccount.getMinBalance(), 0.0, 0.01);
        assertEquals(savingsAccount.getMinBalance(), 0.0, 0.01);
        currentAccount.setMinBalance(25);
        savingsAccount.setMinBalance(25);
        assertEquals(currentAccount.getMinBalance(), 25.0, 0.01);
        assertEquals(savingsAccount.getMinBalance(), 25.0, 0.01);
    }

    @Test
    public void testAccName(){
        assertEquals(currentAccount.getAccountHolderName(), "Peter McNaughton");
        assertEquals(savingsAccount.getAccountHolderName(), "Peter McNaughton");
        currentAccount.setAccountHolderName("Reggy Williams");
        savingsAccount.setAccountHolderName("Reggy Williams");
        assertEquals(currentAccount.getAccountHolderName(), "Reggy Williams");
        assertEquals(savingsAccount.getAccountHolderName(), "Reggy Williams");
    }

    @Test
    public void testMaxWithdraw(){
        assertEquals(currentAccount.getMaxWithdraw(), 250.0, 0.01);
        currentAccount.setMaxWithdraw(1000);
        assertEquals(currentAccount.getMaxWithdraw(), 1000.0, 0.01);
    }

    @Test
    public void testInterest(){
        assertEquals(savingsAccount.getInterest(), 0.05, 0.01);
        savingsAccount.setInterest(0.075);
        assertEquals(savingsAccount.getInterest(), 0.075, 0.01);
    }
}