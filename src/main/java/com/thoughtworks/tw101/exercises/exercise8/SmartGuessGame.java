package com.thoughtworks.tw101.exercises.exercise8;

import com.thoughtworks.tw101.exercises.exercise7.GuessGame;
import com.thoughtworks.tw101.exercises.exercise7.Player;

/**
 * Created by patdale on 7/15/15.
 */
public class SmartGuessGame extends GuessGame {

    public SmartGuessGame(Player player) {
        super(player);
    }

    @Override
    public void beginGame() {
        super.beginGame();
        ((SmartPlayer) player).printGuessList();
    }
}