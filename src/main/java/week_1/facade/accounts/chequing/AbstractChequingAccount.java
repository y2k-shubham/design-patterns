package week_1.facade.accounts.chequing;

import week_1.facade.accounts.IAccount;

import java.math.BigDecimal;

public abstract class AbstractChequingAccount implements IAccount {

    private static final BigDecimal MIN_BALANCE = BigDecimal.valueOf(-50000);

    @Override
    public void deposit(BigDecimal amount) {
        setBalance(getBalance().add(amount));
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (getBalance().subtract(amount).compareTo(MIN_BALANCE) >= 0) {
            setBalance(getBalance().subtract(amount));
        } else {
            throw new IllegalArgumentException("Can't withdraw: Min balance will not be preserved");
        }
    }
}
