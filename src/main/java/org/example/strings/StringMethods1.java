package org.example.strings;

public class StringMethods1 {

    public static void main(String[] args) {
        String name1 = "Some Name";
        String name2 = "Some Name";
        String name3 = "Some Other Name";
        String name4 = "Paulo Bueno";
        String name5 = "Paulo";
        String name6 = "A";
        String name7 = "a";

        int namesDiff;

        for(int i=0; i < name1.length(); i++) {
            System.out.print(name1.charAt(i) + " ");
        }

        System.out.println();

        if(name1.equals(name2)) {
            System.out.println("Names are equal");
        } else {
            System.out.println("Names are not equal.");
        }

        namesDiff = name2.compareTo(name3);
        if(name2.compareTo(name3) < 0) {
            System.out.println("name2 < name3 --> " + namesDiff);
        } else {
            System.out.println("name2 >= name3 --> " + namesDiff);
        }

        namesDiff = name2.compareTo(name4);
        if(name2.compareTo(name4) < 0) {
            System.out.println("name2 < name4 --> " + namesDiff);
        } else {
            System.out.println("name2 >= name4 --> " + namesDiff);
        }

        namesDiff = name4.compareTo(name5);
        if(name4.compareTo(name5) < 0) {
            System.out.println("name4 < name5 --> " + namesDiff);
        } else if (name4.compareTo(name5) == 0) {
            System.out.println("name4 == name5 --> " + namesDiff);
        } else {
            System.out.println("name4 > name5 --> " + namesDiff);
        }

        namesDiff = name6.compareTo(name7);
        if(name6.compareTo(name7) < 0) {
            System.out.println(name6 + " < " + name7 + " --> " + namesDiff);
        } else if (name6.compareTo(name7) == 0) {
            System.out.println(name6 + " == " + name7 + " --> " + namesDiff);
        } else {
            System.out.println(name6 + " > " + name7 + " --> " + namesDiff);
        }


    }

}
