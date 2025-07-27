package org.example.methods;

public class CountUpTo {

    public static void main(String[] args) {
        countUpTo(5, 10);
    }

    public static void countUpTo(int start, int end) {
        if (start < end) {
            System.out.println(start);
            countUpTo(start + 1, end);
        }
    }

}
