package week_1.factory.with.method.obscure;

import week_1.factory.knife.concrete.ChefsKnife;
import week_1.factory.knife.Knife;
import week_1.factory.knife.concrete.SteakKnife;

public class KnifeStore {

    public Knife orderKnife(String knifeType) {
        // create knife object - concrete instantiation
        Knife knife = createKnife(knifeType);

        // prepare knife
        knife.sharpen();
        knife.polish();
        knife.pakage();

        return knife;
    }

    private Knife createKnife(String knifeType) {
        Knife knife = null;

        // create knife object - concrete instantiation
        if (knifeType.equals("steak")) {
            knife = new SteakKnife();
        } else if (knifeType.equals("chefs")) {
            knife = new ChefsKnife();
        } else {
            throw new UnsupportedOperationException(String.format("orderKnife(knifeType=%s)", knifeType));
        }

        return knife;
    }
}
