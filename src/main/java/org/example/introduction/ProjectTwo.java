package org.example.introduction;
import java.util.Scanner;

public class ProjectTwo {

    public static void main(String[] args) {
        String adjectiveOne;
        String place;
        String clothing;
        String hobby;
        String femaleName;
        String maleNameOne;
        String maleNameTwo;
        String occupationOne;
        String occupationTwo;
        Scanner keyboard = new Scanner(System.in);
        String text = """
                There once was a %s girl named %s, who was a %s
                in the Kingdom of %s. She loved to wear %s and to %s.
                She wanted to marry the %s named %s but her father,
                King %s forbid hor from seeing him.
                """;

        System.out.print("Adjective: ");
        adjectiveOne = keyboard.nextLine();
        System.out.print("Place: ");
        place = keyboard.nextLine();
        System.out.print("Clothing: ");
        clothing = keyboard.nextLine();
        System.out.print("Hobby: ");
        hobby = keyboard.nextLine();
        System.out.print("Female name: ");
        femaleName = keyboard.nextLine();
        System.out.print("Male name one: ");
        maleNameOne = keyboard.nextLine();
        System.out.print("Male name two: ");
        maleNameTwo = keyboard.nextLine();
        System.out.print("Occupation one: ");
        occupationOne = keyboard.nextLine();
        System.out.print("Occupation two: ");
        occupationTwo = keyboard.nextLine();

        System.out.println(text.formatted(adjectiveOne, femaleName, occupationOne,
                place, clothing, hobby, occupationTwo, maleNameOne, maleNameTwo));

    }

}
