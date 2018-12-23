package week_1.facade;

import week_1.facade.accounts.AccountFactory;
import week_1.facade.accounts.IAccount;
import week_1.facade.accounts.savings.SavingsAccount;

import java.math.BigDecimal;
import java.util.Hashtable;

public class BankingService {

    private Hashtable <Integer, IAccount> bankAccounts;
    private AccountFactory accountFactory;

    public BankingService() {
        bankAccounts = new Hashtable<>();
        accountFactory = AccountFactory.getInstance();
    }

    public int createAccount(String type, BigDecimal initialBalance) {
        IAccount newAccount = accountFactory.createAccount(type, initialBalance);

        if (newAccount == null) {
            return -1;
        } else {
            bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
    }

    private IAccount getAccount(int accountNumber) {
        return bankAccounts.getOrDefault(accountNumber, null);
    }

    public void transfer(int from, int to, BigDecimal amount) {
        IAccount fromAccount = bankAccounts.getOrDefault(from, null);
        IAccount toAccount = bankAccounts.getOrDefault(to, null);

        if (fromAccount != null && toAccount != null) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
        } else {
            throw new IllegalArgumentException("Invalid from or to account number");
        }
    }

    public BigDecimal getBalance(int accountNumber) {
        IAccount account = bankAccounts.getOrDefault(accountNumber, null);
        if (account != null) {
            return account.getBalance();
        } else {
            throw new IllegalArgumentException("Invalid account number");
        }
    }
}
