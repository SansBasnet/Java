package com.SansBasnet;

public class Main {

    public static void main(String[] args) {


	int highScore = calculateScore(true, 800, 5, 100);
	System.out.println("Your final score was = " + highScore);

	highScore = calculateScore(true, 8, 5, 200);
	System.out.println("Your final score was = " + highScore);

	// Create a method called displayHighScorePosition
	// it should receive a players name as a parameter, and a 2nd parameter as a position in the high score table
	// You should display the players name along with a message like "managed to get into position" and the
	// position they got and a further message " on the high score table."
	//
	// Create a 2nd method called calculateHighScorePosition
	// it should be sent one argument only, the player score
	// it should return an int
	// 1 if the score is >= 1000
	// 2 if the score is >= 500 and < 1000
	// 3 if the score is >= 100 and < 500
	// 4 in all other cases
	// call both methods and display the results of the following
	// a score fo 1500, 900, 400, and 50
	//

		// Solution:

		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Sans", highScorePosition);

		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Alex", highScorePosition);

		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Grant", highScorePosition);

		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Homer", highScorePosition);

		highScorePosition = calculateHighScorePosition(800);
		displayHighScorePosition("Bob", highScorePosition);

		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Alice", highScorePosition);

		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Tim", highScorePosition);

    }

	public static void	displayHighScorePosition(String playerName, int highScorePosition){
		System.out.println(playerName + " managed to get into position "
		+ highScorePosition + " on the high score table");
	}

	public static int calculateHighScorePosition(int playerScore){
//
//    	if (playerScore >= 1000){
//    		return 1;
//		} else if (playerScore >= 500){
//    		return 2;
//		} else if (playerScore >= 100) {
//			return 3;
//		}
//
//    	return 4;

		// A different method to the same answer as required.

		int position =  4; //assuming position 4 will be returned

		if(playerScore >= 1000) {
			position = 1;
		} else if(playerScore >= 500){
			position = 2;
		} else if (playerScore >= 100){
			position = 3;
		}

		return position;
	}
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver){
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}

		return -1;
	}
}
