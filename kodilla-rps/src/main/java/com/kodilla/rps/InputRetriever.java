package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class InputRetriever {
        public String userName;
        public Integer howManyRounds;

    public void getInputData() {
        Scanner readInputData = new Scanner(System.in);

        System.out.println("Please write your name and press ENTER:");
        userName = readInputData.nextLine();
        System.out.println("Welcome "+userName+" in PAPER-ROCK-SCISSORS game!");

        howManyRounds=0;
        boolean isNotCorrect = true;
        System.out.println("Please write a number how many rounds do you want to play and press ENTER:");

        do {
            try {
                howManyRounds = readInputData.nextInt();
                isNotCorrect=false;
            } catch (InputMismatchException e) {
                System.err.println("Wrong input data!!!");
                readInputData.nextLine();
                System.out.println("Please write a NUMBER from 1 to 20 and press ENTER");
            }
            catch (NoSuchElementException ex) {
                System.err.println("Wrong input data!!");
                readInputData.nextLine();
                System.out.println("Please write a NUMBER from 1 to 20 and press ENTER");
            }

        } while (isNotCorrect);{
            System.out.println("Now is OK ;-)");
        }


        int computerScore = 0;
        int playerScore = 0;

        for(int roundAmount=1;roundAmount<howManyRounds+1;roundAmount++) {

            int playerMove=0;
            System.out.println("Please make your move and press ENTER: ");
            Scanner readMove = new Scanner(System.in);
            isNotCorrect = true;
            do {
                try {
                    playerMove = (Integer.parseInt(readMove.nextLine()));
                    isNotCorrect=false;
                } catch (InputMismatchException e) {
                    System.err.println("Wrong input data!!!");
                    readInputData.nextLine();
                    System.out.println("Please write a NUMBER from 1 to 3 and press ENTER");
                }
                catch (NumberFormatException ex) {
                    System.err.println("Wrong input data!!");
                    readInputData.nextLine();
                    System.out.println("Please write a NUMBER from 1 to 3 and press ENTER");
                }

            } while (isNotCorrect);{
            }

            Integer computerMove=null;
            Random rand = new Random();
            computerMove = rand.nextInt(3) + 1;

            System.out.println("Computer move was: " + computerMove + ", Your move was: " + playerMove);

            GameRules gameRules = new GameRules();
            switch (gameRules.whoWins(computerMove,playerMove)){
                case 0: //draw
                    System.out.println("In this round we have a draw. Let's repeat!");
                    roundAmount=roundAmount-1;
                    break;

                case -1: //wins player
                    System.out.println("In round " + roundAmount + " player " + userName + " wins.");
                    playerScore = playerScore + 1;
                    break;

                case 2: //wins player
                    System.out.println("In round " + roundAmount + " player " + userName + " wins.");
                    playerScore = playerScore + 1;
                    break;

                default: //wins computer
                    System.out.println("In round " + roundAmount + " computer wins.");
                    computerScore = computerScore + 1;
            }
        }

        System.out.println("\n\nGAME FINISHED!");
        System.out.println("Computer won "+computerScore+" rounds;   "+userName+" won "+playerScore+" rounds. So...");
        System.out.println("\nTHE WINNER IS: ");
        if(computerScore>playerScore){
            if(computerScore<playerScore){
                System.out.println(userName+"!!!");
            }
            System.out.println("COMPUTER!!!");
        }else {
            System.out.println("We have no WINNER. DRAW!!!");
        }
    }
}
