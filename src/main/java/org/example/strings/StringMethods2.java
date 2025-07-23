package org.example.strings;

public class StringMethods2 {
    public static void main(String[] args) {
        String name = "Paulo Bueno";

        String upper = name.toUpperCase();
        String lower = name.toLowerCase();

        int whereIsB = name.indexOf("B");

        String lastName = name.substring(6);

        System.out.println("upper " + upper);
        System.out.println("lower " + lower);
        System.out.println("whereIsB " + whereIsB);
        System.out.println("lastName " + lastName);

    }

}
