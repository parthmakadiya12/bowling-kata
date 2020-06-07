package com.bowling.game;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class GameTest {

    @Test
    public void canScoreGutterGame() {
        Game game = new Game();
        game.roll(0,0,0,0,0,0,0,0,0,0);
        assertEquals(0,game.score());
    }
}