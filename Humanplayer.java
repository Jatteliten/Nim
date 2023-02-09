package Nim2;

import java.util.Scanner;

public class Humanplayer {

    private String name;

    public Humanplayer() {
        this.name = "Human";
    }

    public String getName() {
        return this.name;
    }

    public int move(Pile p) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your move. There are " + p.getRemainingMatches() + " matches");
        int move = 1;
        boolean numberCorrect = false;
        while (!numberCorrect) {
            try {
                String moveTry = scan.next();
                move = Integer.parseInt(moveTry);
                numberCorrect = true;
            } catch (NumberFormatException e) {
                System.out.println("Please provide a number between one and " + p.getRemainingMatches() / 2);
            }

        }

        p.setMatchesTaken(move);

        return move;
    }

    public String result(Pile p) {
        return "You remove " + p.getMatchesTaken() + " matches";
    }

} // Human player
