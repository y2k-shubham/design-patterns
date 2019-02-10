package week_1.assignment_1;

import java.util.logging.Logger;

/**
 * Implementation for OldCoffeeMachine
 */
public class OldCoffeeMachine {

    private Logger logger;

    public OldCoffeeMachine() {
        this.logger = Logger.getLogger(OldCoffeeMachine.class.getName());
    }

    public void selectA() {
        this.logger.info("Dispensing Coffee A");
    }

    public void selectB() {
        this.logger.info("Dispensing Coffee B");
    }
}
