package week_1.factory.with.object.factory;

import week_1.factory.knife.Knife;

public class KnifeStore {

    private KnifeFactory knifeFactory;

    public KnifeStore(KnifeFactory knifeFactory) {
        this.knifeFactory = knifeFactory;
    }

    public Knife orderKnife(String knifeType) {
        // create knife object - concrete instantiation
        Knife knife = knifeFactory.createKnife(knifeType);

        // prepare knife
        knife.sharpen();
        knife.polish();
        knife.pakage();

        return knife;
    }
}
