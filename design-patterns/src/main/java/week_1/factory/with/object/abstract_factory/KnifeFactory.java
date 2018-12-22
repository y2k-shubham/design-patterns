package week_1.factory.with.object.abstract_factory;

import week_1.factory.knife.Knife;

public abstract class KnifeFactory {

    abstract Knife createKnife(String knifeType);
}
