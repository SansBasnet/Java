package com.SansBasnet;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; // This entire line is the statement, whilst myVariable = 50 is the expression.
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        // Statement don't need to be on one line
        System.out.println("This is " +
                            "another " +
                            "statement in multiple lines.");

        int anotherVariable = 50; myVariable--;
        System.out.println("This is again another line"); //This is a valid statement because it's found the separator i.e. ;

        int         wideSpace

                =

                50; // Java allows white space but is not recommended, obviously.

        //If you mess indentation, just click on code and click 'Reformat Code..'
    }
}
