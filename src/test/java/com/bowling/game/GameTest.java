package com.bowling.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class GameTest {

    private Game game;

    @BeforeEach
    private void setUp() {
        game = new Game();
    }

    @Test
    public void canScoreGutterGame() {
        game.roll(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void canScoreAllOne() {
        game.roll(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        assertEquals(10, game.score());
    }

    @Test
    public void canScoreSpareBalls() {
        game.roll(5, 5, 3, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(16, game.score());
    }

    @Test
    public void canScoreStrikeBalls() {
        game.roll(10, 4, 4, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(26, game.score());
    }

    @Test
    public void canScorePerfectGame() {
        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertEquals(300, game.score());
    }
}