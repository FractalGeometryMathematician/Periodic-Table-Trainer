package PeriodicTableAwesomeGame;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Periodic Table Practice, by Vineet Petlur");
    SetGame set = new SetGame();
    set.startScanner();
    set.readyArray();
    System.out.println("Type how many rounds you want to play");
    int rounds = scan.nextInt();
    System.out.println("Starting game now. Just exit if you want to leave before all rounds are up.");
    set.Game(rounds);
    set.stopScanner();
    scan.close();
  }
}