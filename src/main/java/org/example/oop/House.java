package org.example.oop;

public class House {
    private int numStories;
    private int numWindows;
    private String color;

    public House(int theNumStories, int theNumWindows, String theColor) {
        numStories = theNumStories;
        numWindows = theNumWindows;
        color = theColor;
    }

    public int getNumStories() {
        return numStories;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public String getColor() {
        return color;
    }

    public void setNumStories(int theNumStories) {
        numStories = theNumStories;
    }

    public void setNumWindows(int theNumWindows) {
        numWindows = theNumWindows;
    }

    public void setColor(String theColor) {
        color = theColor;
    }

}
