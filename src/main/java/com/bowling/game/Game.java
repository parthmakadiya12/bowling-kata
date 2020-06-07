package com.bowling.game;

public class Game {

    int[] rolls = new int[21];

    public int score() {
        int score = 0;
        for (int i = 0; i < rolls.length; i++) {
            score += rolls[i];
        }
        return score;
    }

    public void roll(int... pinsDown) {
        for (int i = 0; i < pinsDown.length; i++) {
            rolls[i] = pinsDown[i];
        }
    }
}
