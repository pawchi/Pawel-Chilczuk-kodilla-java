package com.kodilla.rps;

public class GameRules {

    public int winNumber;

    public int whoWins(int computer, int player){
        winNumber=computer-player;

        return winNumber ;
    }
}
