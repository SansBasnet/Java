package com.SansBasnet;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(" 1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; //3 - 1 = 2
        System.out.println("3 - 1 = "+ result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; //20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result +=2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false; // = is the assignment operator. It assigns the value of an expression to the variable on the right of the operator.
        if (isAlien == false) {// == is testing to see if the particular value is false. It's checking IF the content of the variables isAlien is false. In other words,
            //isAlien equal to false. In this case it is false, because right above it was defined above as false. Therefore, isAlien = false, a true statement.
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100) {  // != is not equal to, >= greater than equal to.
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100)){ // && are called logical and operator. It checks if BOTH operand left and right are true.
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar){ // !isCar is means NOT operator.
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = (isCar) ? true : false; //three operands.
        if(wasCar){
            System.out.println("wasCar is true");
        }

        double newVar = 20.00d;
        double secondVar = 80.00d;
        double output =  (newVar + secondVar) * 100.00d;
        System.out.println("output = " + output);
        double theRemainder = output % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNotRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNotRemainder);
        if(!isNotRemainder){
            System.out.println("Got some remainder");
        }

    }
}
