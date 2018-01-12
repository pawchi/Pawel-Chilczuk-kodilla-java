package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args)  {

        GameInfo gameInfo = new GameInfo();
        gameInfo.showGameInformation();

        InputRetriever inputRetriever = new InputRetriever();
        inputRetriever.getInputData();

    }
}
