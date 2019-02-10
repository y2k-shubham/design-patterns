package week_1.facade.accounts.investment;

import week_1.facade.accounts.IAccount;

import java.math.BigDecimal;

public abstract class AbstractInvestmentAccount implements IAccount {

    private static final BigDecimal MIN_BALANCE = BigDecimal.valueOf(2000);
    private static final BigDecimal MIN_DEPOSIT = BigDecimal.valueOf(500);

    @Override
    public void deposit(BigDecimal amount) {
        if (MIN_DEPOSIT.compareTo(amount) >= 0) {
            setBalance(getBalance().add(amount));
        } else {
            throw new IllegalArgumentException("Can't deposit less than MIN_DEPOSIT");
        }
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
