package org.example.methods;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(getResult(10));
        System.out.println(getResult(10, 10));
        System.out.println(getResult(10, "10"));
        System.out.println(getResult("Some", "String"));
    }

    public static int getResult(int num) {
        return num;
    }

    public static int getResult(int num1, int num2) {
        return num1 * num2;
    }

    public static int getResult(int num1, String num2) {
        return num1 * Integer.parseInt(num2);
    }

    public static String getResult(String s1, String s2) {
        return s1 + " " + s2;
    }

}
