package Nim2;
import java.util.Random;
    public class Computerplayer {
        final public String name() {
            return "Computer";
        }

        public String move(){
            Pile p = new Pile();
            Random rand = new Random();
            int max = p.remainingMatches / 2;
            return String.valueOf(rand.nextInt(max) + 1);
        }
        public String result(){
            return "Computer removes x matches";

        }

    } // Computerplayer