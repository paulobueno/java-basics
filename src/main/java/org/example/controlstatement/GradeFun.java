package org.example.controlstatement;

import java.util.Scanner;

public class GradeFun {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char grade;

        System.out.println("Enter a grade.");
        grade = keyboard.next().charAt(0);

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("NERD ALERT");
                break;
            case 'B':
            case 'b':
                System.out.println("Good job");
                break;
            case 'C':
            case 'c':
                System.out.println("You can do better");
                break;
            case 'D':
            case 'd':
                System.out.println("You're getting pretty close to failing");
                break;
            case 'E':
            case 'e':
                System.out.println("You are failing the course");
                break;
            case 'F':
            case 'f':
                System.out.println("You s**k");
                break;
            default:
                System.out.println("WRONG GRADE MF!");
        }
    }

}
