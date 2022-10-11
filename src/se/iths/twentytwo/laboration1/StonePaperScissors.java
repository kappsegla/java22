package se.iths.twentytwo.laboration1;

import java.util.Random;
import java.util.Scanner;

import static se.iths.twentytwo.laboration1.Choice.STONE;

public class StonePaperScissors {

    int playerScore = 0;
    int computerScore = 0;

    Random random = new Random();

    public void play(Scanner scanner) {

        do {
            //Player choice, will throw Exception for invalid input
            var playerChoice = Choice.valueOf(scanner.nextLine().toUpperCase());

            //Computer choice
            Choice computerChoice = Choice.values()[random.nextInt(3)];

            //Check round winner
            if (playerChoice == STONE && computerChoice == STONE)
                //draw stone - stone


                //Check total winner
                if (playerScore == 3)
                    System.out.println("You won against the computer");
            if (computerScore == 3)
                System.out.println("The computer won");

        } while (playerScore < 3 && computerScore < 3);
    }
}

enum Choice {
    STONE, PAPER, SCISSORS
}
