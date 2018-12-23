package week_1.facade.accounts.chequing;

import java.math.BigDecimal;

public class ChequingAccount extends AbstractChequingAccount {

    private int accountNumber;
    private BigDecimal balance;

    public ChequingAccount(int accountNumber, BigDecimal initialBalance) {
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
