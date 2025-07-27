package org.example.methods;

public class CountDown {

    public static void main(String[] args) {

        countDownFrom(10);

    }

    public static void countDownFrom(int num) {
        if (num >= 0) {
            System.out.println(num);
            countDownFrom(num -1);
        }
    }

}
