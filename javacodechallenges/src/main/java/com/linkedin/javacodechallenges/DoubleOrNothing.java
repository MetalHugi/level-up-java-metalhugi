package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

  private boolean isStillPlaying = true;
  private Random random = new Random();
  private Scanner scanner = new Scanner(System.in);

  public void playGame() {
    int sum = 10;
    printWelcome();
    printWantToContinue();

    while (isStillPlaying) {
      if (doubleOrNothing()) {
        sum = sum * 2;
        System.out.println("Yaaaay, it's a double! Your current score is: " + sum);
        printWantToContinue();

      } else {
        System.out.println("IT'S A MISSSSSSSSS!!! ");
        return;
      }
    }
    System.out.println("Bye! It was fun to play, your score: " + sum);
  }

  private void printWelcome() {
    System.out.println("Hi! This is a game. You have 10 points in the beginning. ");
  }

  private void printWantToContinue() {
    System.out.println("Do you want to continiue? ");
    this.isStillPlaying = this.scanner.nextLine().toLowerCase().equals("yes");
  }

  private boolean doubleOrNothing() {
    return this.random.nextInt(2) == 0;
  }

  protected boolean isStillPlaying(){
    return this.isStillPlaying;
  }
}