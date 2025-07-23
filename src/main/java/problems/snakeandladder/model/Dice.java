package problems.snakeandladder.model;

import java.util.Random;


public class Dice {
    private int numberOfSideInDice;
    private static int MIN = 1;
    Random random;

    public Dice(int numberOfDice) {
        random = new Random();
        this.numberOfSideInDice = numberOfDice;
    }

    public int getNumberInRollOfDice() {
        return random.nextInt((this.numberOfSideInDice - MIN) + 1) + 1;
    }
}
