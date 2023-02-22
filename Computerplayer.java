// Daniel Isaksson
// Daniel.isaksson90@gmail.com
package Nim;
public class Computerplayer extends Player {

    public Computerplayer(){
        this.name = "Computer";
    }

    //Determine number of matches computer will remove
    public int move(Pile pile){
        int min = 1;
        int max = pile.getRemainingMatches() / 2;
        int compMove = (int) Math.floor(Math.random() *(max - min + 1) + min);
        pile.setMatchesTaken(compMove);
        return compMove;
    }

    //Set message to display at end of turn for computer player
    public String result(Pile pile){
        return getName() + " removes " + pile.getMatchesTaken()+ " matches";

    }

} // Computerplayer