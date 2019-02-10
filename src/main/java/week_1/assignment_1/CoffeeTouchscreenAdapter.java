package week_1.assignment_1;

/**
 * Adapter that adapts actions from (New) CoffeeMachineInterface
 * to conform with the actions expected by OldCoffeeMachine
 */
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private OldCoffeeMachine oldCoffeeMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldCoffeeMachine) {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
        oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelect() {
        oldCoffeeMachine.selectB();
    }
}
