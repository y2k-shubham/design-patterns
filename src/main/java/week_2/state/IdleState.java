// 'Lazy' implementation of Singletons: https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples

package week_2.state;

public class IdleState implements IState {

    private static IState stateInstance;

    private IdleState() {
    }

    public static IState getInstance() {
        if (stateInstance == null) {
            stateInstance = new IdleState();
        }
        return stateInstance;
    }

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Dollar inserted");
        vendingMachine.setState(vendingMachine.getHasOneDollarState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("No money to return");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Payment required");
    }
}
