package org.example.introduction;

public class ArithmeticFun {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int result = a + b;
        int quotient = b / a;

        System.out.println("Result is: " + result);
        // For integer quotient, it truncates the number to int, even though it results any remaining decimal numbers
        // E.g.: 15/10=1 and not =1.5
        System.out.println("Result is: " + quotient);

        // Equals to Python
        result += 10;
        System.out.println("Result is: " + result);
        result++;
        System.out.println("Result is: " + result);

        System.out.println("Integer result: " + 15 / 10); // 1
        System.out.println("Double result: " + 15.0 / 10.0); // 1.5

    }

}
