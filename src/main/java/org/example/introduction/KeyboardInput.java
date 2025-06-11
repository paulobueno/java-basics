package org.example.introduction;
import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       String name;
       int age;
       double number;
       String city;

       System.out.println("What is your name?");
       name = keyboard.nextLine();

       System.out.println("What is your age?");
       age = keyboard.nextInt();
       keyboard.nextLine(); // needed so it consumes the \n character, once it is not consumed by `nextInt()` method

       System.out.println("Give a number to be multiplied by 2.0");
       number = keyboard.nextDouble();
       number *= 2;
       keyboard.nextLine();

       System.out.println("What city do you live in?");
       city = keyboard.nextLine();

       System.out.println("Hello, " + name);
       System.out.println("Your age is " + age);
       System.out.println("You live in " + city);
       System.out.println("Your number multiplied by 2.0: " + number);
    }
}
