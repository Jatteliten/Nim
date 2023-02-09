package Nim2;

import java.util.Random;

public class Computerplayer {
    private String name;

    public Computerplayer() {
        this.name = "Computer";
    }

    public String getName() {
        return this.name;
    }

    public int move(Pile p) {
        Random rand = new Random();
        int min = 1;
        int max = p.getRemainingMatches() / 2;
        int compMove = (int) Math.floor(Math.random() * (max - min + 1) + min);
        p.setMatchesTaken(compMove);
        return compMove;
    }

    public String result(Pile p) {
        return "Computer removes " + p.getMatchesTaken() + " matches";

    }

} // Computerplayer