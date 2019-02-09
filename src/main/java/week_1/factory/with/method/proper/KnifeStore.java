package week_1.factory.with.method.proper;

import week_1.factory.knife.Knife;

public abstract class KnifeStore {

    public Knife orderKnife(String knifeType) {
        // create knife object - concrete instantiation
        Knife knife = createKnife(knifeType);

        // prepare knife
        knife.sharpen();
        knife.polish();
        knife.pakage();

        return knife;
    }

    abstract Knife createKnife(String knifeType);
}
