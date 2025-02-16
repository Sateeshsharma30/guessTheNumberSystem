/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guessthenumbersystme;

  import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class GussTheNumberSystme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int maxAttempts = 4;
        int rounds = 3;
        int score = 0;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("You have " + rounds + " rounds and " + maxAttempts + " attempts each round.");

        for (int round = 1; round <= rounds; round++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.println("\nRound " + round + ": Guess a number between " + min + " and " + max);

            boolean hasGuessed = false;

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Correct! You've guessed the number.");
                    score += (maxAttempts - attempt + 1) * 10; // More points for fewer attempts
                    hasGuessed = true;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!hasGuessed) {
                System.out.println("Sorry! The correct number was " + randomNumber);
            }
        }

        System.out.println("\nGame Over! Your total score is: " + score);
        scanner.close();
    }
}

