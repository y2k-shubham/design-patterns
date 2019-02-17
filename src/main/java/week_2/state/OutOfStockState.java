package week_2.state;

public class OutOfStockState implements IState {

    private static IState stateInstance;

    private OutOfStockState() {
    }

    public static IState getInstance() {
        if (stateInstance == null) {
            stateInstance = new OutOfStockState();
        }
        return stateInstance;
    }

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Out of stock! Returning money");
        vendingMachine.doReturnMoney();
        // not really required, just for safety
        vendingMachine.setState(vendingMachine.getOutOfStockState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to return");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Out of stock!");
    }
}
