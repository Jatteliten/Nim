package Nim2;
import java.util.Scanner;
    public class Humanplayer{
        final public String name(){
            return "Human";
        }

        public int move() {
            Pile p = new Pile();
            Scanner scan = new Scanner(System.in);
            System.out.println("Your move. There are " + p.getRemainingMatches() + " matches");
            int move = 1;
            boolean numberCorrect = false;
            while(!numberCorrect) {
                try {
                    String moveTry = scan.next();
                    move = Integer.parseInt(moveTry);
                    numberCorrect = true;
                } catch (NumberFormatException e) {
                    System.out.println("Please provide a number between one and " + p.getRemainingMatches() / 2);
                }

            }
            p.setMatchesTaken(move);
            p.setRemainingMatches();
            return move;
        }

        public String result() {
            Pile p = new Pile();
            return "You remove " + p.getMatchesTaken() + " matches";
        }

    } //Human player

