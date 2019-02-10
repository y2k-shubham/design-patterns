package week_1.facade.accounts.savings;

import week_1.facade.accounts.IAccount;

import java.math.BigDecimal;

public abstract class AbstractSavingsAccount implements IAccount {

    private static final BigDecimal MIN_BALANCE = BigDecimal.valueOf(1000);

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
