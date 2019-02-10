package week_1.facade.accounts.investment;

import java.math.BigDecimal;

public class InvestmentAccount extends AbstractInvestmentAccount {

    private int accountNumber;
    private BigDecimal balance;

    public InvestmentAccount(int accountNumber, BigDecimal initialBalance) {
        this.accountNumber = accountNumber;
        setBalance(initialBalance);
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}
