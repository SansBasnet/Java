package com.SansBasnet;

public class Main {

    public static void main(String[] args) {
        // 8 data types
        // byte (barely used)
        // short (rarely used)
        // int (frequently used)
        // float (rarely used)
        // double (frequently used)
        // char (sometimes used)
        // boolean (frequently used)

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // Still set up as a string, run to see.. Java converts 50 to a string and appends.
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.43d; //Took the value as a text and appended that text value as String
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
    }

}
