// Daniel Isaksson
// Daniel.isaksson90@gmail.com
package Nim;
import java.util.Scanner;
public class Humanplayer extends Player{

    //Name human player
    public Humanplayer(){
        this.name = "Human";
    }

    //Scan for matches to remove from player
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

    //Set message to display at end of turn for player
    String result(Pile pile) {
        return name + " removes " + pile.getMatchesTaken() + " matches";
    }

} //Human player