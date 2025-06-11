package org.example.introduction;

public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 36;
        int yourAge = 28;
        String myName = new String("Paulo");
        String yourName = new String("Paulo");

        boolean comparison = yourName == myName;
        System.out.println("Names are equal? " + comparison); // returns false, once they have different addresses

    }
}
