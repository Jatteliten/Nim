package Nim2;
public class Pile extends Game {


    //public void remainingMatches(int parseInt) {
   // }
    public int remainingMatches;

    public int matchesTaken;

    public int getRemainingMatches (){
        return remainingMatches;
    }
    public void setRemainingMatches(){
        remainingMatches -= matchesTaken;
    }

    public int getMatchesTaken(){
        return matchesTaken;
    }
    public void setMatchesTaken(int remove){
        this.matchesTaken = remove;
    }


}
