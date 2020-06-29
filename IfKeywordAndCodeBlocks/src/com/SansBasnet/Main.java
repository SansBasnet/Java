package com.SansBasnet;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
            int score = 10000;
            int levelCompleted = 8;
            int bonus = 200;

//            if(score < 5000 && score > 1000) { //  Always use the code block on if statement even if for one statement.
//                System.out.println("Your score was less than 5000 but greater than 1000");
//            } else if (score < 1000){
//                System.out.println("your score was less than 1000");
//
//            }
//            else {
//                System.out.println("Got here");
//            }

            if (gameOver) { // if(gameOver) is the same as  if(gameOver == true), it is checking for true.
                int finalScore = score + (levelCompleted * bonus);
                System.out.println("Your final score was" + finalScore);
            }
//        boolean newgameOver = true;
//        int newScore = 10000;
//        int newlevelCompleted = 8;
//        int newBonus = 200;
//
//            if (gameOver){
//                int finalScore =newScore + (newlevelCompleted * newBonus);
//                System.out.println("Your final score was " + finalScore);
//            }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) { // if(gameOver) is the same as  if(gameOver == true), it is checking for true.
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
