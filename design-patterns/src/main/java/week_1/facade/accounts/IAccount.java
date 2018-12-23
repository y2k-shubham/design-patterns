package week_1.facade.accounts;

import java.math.BigDecimal;

public interface IAccount {

    public abstract void deposit(BigDecimal amount);

    public abstract void withdraw(BigDecimal amount);

    public abstract BigDecimal getBalance();

    abstract void setBalance(BigDecimal balance);

    public abstract int getAccountNumber();
}
