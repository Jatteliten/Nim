package Nim2;
import java.util.Random;
    public class Computerplayer {
        String name = "Computer";
        String callOut = "";
        Random rand = new Random();
        Pile p = new Pile();
        int max = p.matches() / 2;
        String move = String.valueOf(rand.nextInt(max) + 1);
        String result = "Computer removes x matches";

    } // Computerplayer