package Nim2;

public class Pile extends Game {

    int remainingMatches = 13;
    int matchesTaken;
    public int matches (){
        return remainingMatches-matchesTaken;
    }


}
