package week_1.facade.accounts;

import week_1.facade.accounts.chequing.ChequingAccount;
import week_1.facade.accounts.investment.InvestmentAccount;
import week_1.facade.accounts.savings.SavingsAccount;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Hashtable;

public class AccountFactory {

    private Hashtable <String, Integer> nextAccountNumber;
    private static AccountFactory accountFactory;

    private AccountFactory() {
        nextAccountNumber = new Hashtable<>();
    }

    public static AccountFactory getInstance() {
        if (accountFactory == null) {
            accountFactory = new AccountFactory();
        }

        return accountFactory;
    }

    public IAccount createAccount(String type, BigDecimal initialBalance) {
        IAccount newAccount = null;

        switch (type) {
            case "savings": newAccount = new SavingsAccount(getNextAccountNumber(type), initialBalance);
            case "investment": newAccount = new InvestmentAccount(getNextAccountNumber(type), initialBalance);
            case "chequing": newAccount = new ChequingAccount(getNextAccountNumber(type), initialBalance);
               break;
            default:
        }

        return newAccount;
    }

    private Integer getNextAccountNumber(String type) {
        Integer nextAccountNumber = this.nextAccountNumber.getOrDefault(type, 0) + 1;
        this.nextAccountNumber.put(type, nextAccountNumber);
        return nextAccountNumber;
    }
}
