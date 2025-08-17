package org.example.oop;

public class HouseDemo {

    public static void main(String[] args) {
        House myHouse = new House(2, 10, "green");
        House yourHouse = new House(4, 16, "yellow");

        printHouseInfo(myHouse);
        printHouseInfo(yourHouse);

    }

    public static void printHouseInfo(House house) {
        System.out.println("My house is "
                + house.getColor()
                + " and has "
                + house.getNumStories()
                + " and "
                + house.getNumWindows()
                + " windows."
        );
    }

}
