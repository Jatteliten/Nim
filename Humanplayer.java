package Nim2;
import java.util.Scanner;
    public class Humanplayer extends Player{

        public Humanplayer(){
            this.name = "Human";
        }

        int move(Pile pile) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Your move. There are " + pile.getRemainingMatches() + " matches");
            int move = 1;
            boolean numberCorrect = false;
            while(!numberCorrect) {
                try {
                    String moveTry = scan.next();
                    move = Integer.parseInt(moveTry);
                    numberCorrect = true;
                } catch (NumberFormatException e) {
                    System.out.println("Please provide a number between one and " + pile.getRemainingMatches() / 2);
                }

            }

            pile.setMatchesTaken(move);

            return move;
        }

        String result(Pile pile) {
            return "You remove " + pile.getMatchesTaken() + " matches";
        }


    } //Human player

