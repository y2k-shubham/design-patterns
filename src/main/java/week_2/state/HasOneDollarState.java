package week_2.state;

public class HasOneDollarState implements IState {

    private static IState stateInstance;

    private HasOneDollarState() {
    }

    public static IState getInstance() {
        if (stateInstance == null) {
            stateInstance = new HasOneDollarState();
        }
        return stateInstance;
    }

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Already have one dollar");
        vendingMachine.doReturnMoney();
        vendingMachine.setState(vendingMachine.getIdleState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        vendingMachine.doReturnMoney();
        vendingMachine.setState(vendingMachine.getIdleState());
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        vendingMachine.doReleaseProduct();
        if (vendingMachine.getStock() > 0) {
            vendingMachine.setState(vendingMachine.getIdleState());
        } else {
            vendingMachine.setState(vendingMachine.getOutOfStockState());
        }
    }
}
