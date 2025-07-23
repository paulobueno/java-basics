package org.example.strings;

public class StringBuilderFun {

    public static void main(String[] args) {
        StringBuilder myName = new StringBuilder("Paulo");

        myName.append(" Bruno");
        System.out.println(myName);

        myName.insert(5, " Bueno");
        System.out.println(myName);

        myName.replace(6, 10, "Barbosa");
        System.out.println(myName);

        myName.delete(6, 15);
        System.out.println(myName);

        myName.insert(0, "Sr. ");
        System.out.println(myName);

    }
}
