package week_1.composite;

import week_1.composite.concrete.House;
import week_1.composite.concrete.Room;

public class Example1 {

    public static void main(String[] args) {
        // construct house
        House house = new House("my-house");

        // construct rooms
        Room room1 = new Room("room-1");
        Room room2 = new Room("room-2");

        // put rooms in house
        house.addStructure(room1);
        house.addStructure(room2);
    }
}
