package org.example.controlstatement;

public class RepetitionFun {

    public static void main(String[] args) {

        int count = 0;

        while(count < 10) {
//            System.out.println(count);
            count++;
        }

        int count2 = 0;
        do {
//            System.out.println(count2);
            count2++;
        } while (count2 < 10);

        // First define the iteration variable, then the condition to stop, than iteration variable modification.
        // Each parameter is separated by semicolon and not colons.
        // Colons can be used at the update part of the `for` expression, such as `i++, u++` if you have to update
        // both variables
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

}
