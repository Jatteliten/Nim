package Nim2;

public class Game {

    int activePlayer = 1;
    String winner;
    String loser;
    String win = (winner + " wins, " + loser + " loses.");

    public void playGame(){

        Humanplayer h = new Humanplayer();
        Computerplayer c = new Computerplayer();

        String playerOneMove = h.move;
        String playerOneCallOut = h.callOut;
        String playerOneName = h.name;
        String playerOneResult = h.result;

        String playerTwoMove = h.move;
        String playerTwoCallOut = h.callOut;
        String playerTwoName = h.name;
        String playerTwoResult = h.result;

        Pile p = new Pile();

        int Move = 0;

        System.out.println("Welcome to Nm\nPlayer 1: " + playerOneName + "\nPlayer 2: " + playerTwoName);

        int RemainingMatches = p.remainingMatches;

        while (RemainingMatches >= 1) {

            int MatchesTaken;

            System.out.println("Remaining matches: " + RemainingMatches);

            if (RemainingMatches == 1) {
                System.out.println(win);
                break;
            }

            // Player 1
            else if (activePlayer == 1) {
                //insert player here
                System.out.println(playerOneCallOut);

                try {
                    Move = Integer.parseInt(playerOneMove);
                }
                catch (NumberFormatException e){
                    System.out.println("Please input a number");
                }

                MatchesTaken = Move;

                if (MatchesTaken > RemainingMatches/2 || MatchesTaken < 1) {
                    System.out.println("Sorry, illegal move.\nPlease choose at least one match and at most " + RemainingMatches/2);
                    Move = 0;
                    activePlayer = 1;
                }
                else {
                    System.out.println(playerOneResult);
                    RemainingMatches = RemainingMatches - MatchesTaken;
                    winner = playerOneName;
                    loser = playerTwoName;
                    activePlayer = 2;
                }
            } //activePlayer 1

            // Player 2
            else if (activePlayer == 2) {
                //insert player here
                System.out.println(playerTwoCallOut);

                try {
                    Move = Integer.parseInt(playerTwoMove);
                }
                catch (NumberFormatException e){
                    System.out.println("Please input a number");
                }

                MatchesTaken = Move;

                if (MatchesTaken > RemainingMatches/2 || MatchesTaken < 1) {
                    System.out.println("Sorry, illegal move.\nPlease choose at least one match and at most " + RemainingMatches/2);
                    Move = 0;
                    activePlayer = 2;
                }
                else {
                    System.out.println(playerTwoResult);
                    RemainingMatches = RemainingMatches - MatchesTaken;
                    winner = playerTwoName;
                    loser = playerOneName;
                    activePlayer = 1;
                }
            } //activePlayer 2



        }//while
    }
}
