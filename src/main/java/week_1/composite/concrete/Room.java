package week_1.composite.concrete;

import week_1.composite.specs.AbstractStucture;
import week_1.composite.specs.StructureType;

public class Room extends AbstractStucture {

    public Room(String name) {
        super(name);
    }

    @Override
    public StructureType getType() {
        return StructureType.ROOM;
    }
}
