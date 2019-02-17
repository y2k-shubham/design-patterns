package week_2.state;

public class VendingMachine {

    private IState state;
    private Integer stock;

    public VendingMachine(Integer stock) {
        this.stock = stock;
        if (stock > 0) {
            this.state = IdleState.getInstance();
        } else {
            this.state = OutOfStockState.getInstance();
        }
    }

    // getters and setters
    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public Integer getStock() {
        return stock;
    }

    // interaction methods - interact with vending machine
    public void insertDollar() {
        getState().insertDollar(this);
    }

    public void ejectMoney() {
        getState().ejectMoney(this);
    }

    public void dispense() {
        getState().dispense(this);
    }

    // action methods - make VendingMachine perform actions
    public void doReleaseProduct() {
        this.stock = this.stock - 1;
        System.out.println("Released product");
    }

    public void doReturnMoney() {
        System.out.println("Returned money");
    }

    // following methods ensure there is loose coupling between state objects.
    // by using them, state objects never directly refer to one-another (not even imports)
    protected IState getIdleState() {
        return IdleState.getInstance();
    }

    protected IState getHasOneDollarState() {
        return HasOneDollarState.getInstance();
    }

    protected IState getOutOfStockState() {
        return OutOfStockState.getInstance();
    }
}
