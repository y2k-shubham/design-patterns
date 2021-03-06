package week_1.composite.concrete;

import week_1.composite.specs.AbstractCompositeStructure;
import week_1.composite.specs.StructureType;

public class House extends AbstractCompositeStructure {

    public House(String name) {
        super(name);
    }

    @Override
    public StructureType getType() {
        return StructureType.HOUSE;
    }
}
