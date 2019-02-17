package week_2.state;

public interface IState {

    public abstract void insertDollar(VendingMachine vendingMachine);

    public abstract void ejectMoney(VendingMachine vendingMachine);

    public abstract void dispense(VendingMachine vendingMachine);
}
