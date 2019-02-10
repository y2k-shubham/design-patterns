package week_1.composite;

import week_1.composite.concrete.Building;
import week_1.composite.concrete.House;
import week_1.composite.concrete.Room;
import week_1.composite.specs.AbstractCompositeStructure;
import week_1.composite.specs.AbstractStucture;

public class Example2 {

    public static void main(String[] args) {
        // construct building
        AbstractCompositeStructure building = new Building("my-building");

        // construct first house
        AbstractCompositeStructure house1 = new House("house-1");
        AbstractStucture room11 = new Room("room-1-1");
        AbstractStucture room12 = new Room("room-1-2");
        house1.addStructure(room11);
        house1.addStructure(room12);

        // construct second house
        AbstractCompositeStructure house2 = new House("house-2");
        AbstractStucture room21 = new Room("room-2-1");
        house1.addStructure(room21);

        // construct ad-hoc rooms
        AbstractStucture roomAh1 = new Room("room-ad-hoc-1");
        AbstractStucture roomAh2 = new Room("room-ad-hoc-2");

        // put everything inside building
        building.addStructure(house1);
        building.addStructure(house2);
        building.addStructure(roomAh1);
        building.addStructure(roomAh2);
    }
}
