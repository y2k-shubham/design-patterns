package week_1.factory.with.object.abstract_factory;

import week_1.factory.knife.Knife;
import week_1.factory.knife.concrete.BudgetChefsKnife;
import week_1.factory.knife.concrete.BudgetSteakKnife;

public class BudgetKnifeFactory extends KnifeFactory {

    Knife createKnife(String knifeType) {
        Knife knife = null;

        // create knife object - concrete instantiation
        if (knifeType.equals("steak")) {
            knife = new BudgetSteakKnife();
        } else if (knifeType.equals("chefs")) {
            knife = new BudgetChefsKnife();
        } else {
            throw new UnsupportedOperationException(String.format("orderKnife(knifeType=%s)", knifeType));
        }

        return knife;
    }
}
