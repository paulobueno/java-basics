package org.example.methods;

public class MethodsDemo {
    public static void main(String[] args) {
        int result;
        double doubleResult;

        printHello();
        printNumber(10);

        result = giveMe10();
        System.out.println(result);

        result = addThese(3, 5);
        System.out.println(result);

        doubleResult = squareFrom(5.5);
        System.out.println(doubleResult);

    }

    public static void printHello() {
        System.out.println("Hello there!");
    }

    public static void printNumber(int number) {
        System.out.println(number);
    }

    public static int giveMe10() {
        return 10;
    }

    public static int addThese(int num1, int num2) {
        return num1 + num2;
    }

    public static double squareFrom(double num) {
        return num * num;
    }

}
