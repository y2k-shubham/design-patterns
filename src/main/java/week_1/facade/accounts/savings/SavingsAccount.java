package week_1.facade.accounts.savings;

import java.math.BigDecimal;

public class SavingsAccount extends AbstractSavingsAccount {

    private int accountNumber;
    private BigDecimal balance;

    public SavingsAccount(int accountNumber, BigDecimal initialBalance) {
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
