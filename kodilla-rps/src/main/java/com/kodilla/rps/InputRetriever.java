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

            int playerMove;
            System.out.println("Please make your move and press ENTER: ");
            Scanner readMove = new Scanner(System.in);
            playerMove = (Integer.parseInt(readMove.nextLine()));

            Integer computerMove=null;
            Random rand = new Random();
            computerMove = rand.nextInt(3) + 1;

            System.out.println("Computer move was: " + computerMove + ", Your move was: " + playerMove);

            if (computerMove == 1 && playerMove == 1 || computerMove == 2 && playerMove == 2 || computerMove == 3 && playerMove == 3) {
                System.out.println("In this round we have a draw. Let's repeat!");
                roundAmount=roundAmount-1;
            } else {
                if (computerMove == 1 && playerMove == 2 || computerMove == 2 && playerMove == 3 || computerMove == 3 && playerMove == 1) {
                    System.out.println("In round " + roundAmount + " computer wins.");
                    computerScore = computerScore + 1;
                }
                if (computerMove == 2 && playerMove == 1 || computerMove == 3 && playerMove == 2 || computerMove == 1 && playerMove == 3) {
                    System.out.println("In round " + roundAmount + " player " + userName + " wins.");
                    playerScore = playerScore + 1;
                }
                System.out.println("Currant game score after round " + roundAmount + " : Computer score-" + computerScore + "; " + userName + " score-" + playerScore);
            }
        }


        System.out.println("\n\nGAME FINISHED!");
        System.out.println("Computer won "+computerScore+" rounds;   "+userName+" won "+playerScore+" rounds. So...");
        System.out.println("\nTHE WINNER IS: ");
        if(computerScore>playerScore){
            System.out.println("COMPUTER!!!");
        }else {
            System.out.println(userName+"!!!");
        }
    }
}
