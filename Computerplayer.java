package Nim2;
    public class Computerplayer extends Player {

        public Computerplayer(){
            this.name = "Computer";
        }

        public int move(Pile p){
            int min = 1;
            int max = p.getRemainingMatches() / 2;
            int compMove = (int) Math.floor(Math.random() *(max - min + 1) + min);
            p.setMatchesTaken(compMove);
            return compMove;
        }

        public String result(Pile p){
            return "Computer removes " + p.getMatchesTaken()+ " matches";

        }

    } // Computerplayer