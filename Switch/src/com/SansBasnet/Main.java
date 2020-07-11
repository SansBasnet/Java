package com.SansBasnet;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("value was 2");
//        } else{
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("Value  was 1");
                break; //if you don't have a break it will show unpredictable results.

            case 2:
                System.out.println("value was 2");
                break;

            case 3: case 4 : case 5: //grouping model
                System.out.println("was a 3 or a 4 or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break; //the last break could be taken out but good to include.
        }

        char charValue = 'C';

        switch(charValue){
            case 'A':
                System.out.println("Value was A ");
                break;

            case 'B':
                System.out.println("Value was B ");
                break;

            case 'C' : case 'D': case 'E' :
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D or E");
                break;

        }

        String month = "january";
        switch(month.toLowerCase()){ // .toLowerCase executes all lower
            case "january": //make sure this january is in lower case since we used .toLowerCase
                System.out.println("Jan");
                break;

            case "June":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }
}
