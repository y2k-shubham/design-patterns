package week_1.factory.with.method.proper;

import week_1.factory.knife.Knife;
import week_1.factory.knife.concrete.BudgetChefsKnife;
import week_1.factory.knife.concrete.BudgetSteakKnife;

public class BudgetKnifeStore extends KnifeStore {

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
