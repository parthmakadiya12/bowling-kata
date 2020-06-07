package com.bowling.game;

public class Game {

    int[] rolls = new int[21];

    public int score() {
        int score = 0;
        int current = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isSpareBall(current)) {
                score += 10 + rolls[current + 2];
                current+=2;
            } else {
                score += rolls[current] + rolls[current + 1];
                current += 2;
            }
        }
        return score;
    }

    public void roll(int... pinsDown) {
        for (int i = 0; i < pinsDown.length; i++) {
            rolls[i] = pinsDown[i];
        }
    }

    private boolean isSpareBall(int current) {
        return rolls[current] + rolls[current + 1] == 10;
    }
}
