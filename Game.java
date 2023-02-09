package Nim2;

public class Game {

    public void playGame(){

        String winner = null;
        String loser = null;

        Humanplayer h = new Humanplayer();
        Computerplayer c = new Computerplayer();

        //insert player here. h for human. c for computer.
        String playerOneName = h.name();
        String playerTwoName = h.name();

        Pile p = new Pile();

        p.remainingMatches = 10;
        p.setRemainingMatches();

        boolean firstPlayer = true;
        boolean play = true;

            System.out.println("Welcome to Nm\nPlayer 1: " + playerOneName + "\nPlayer 2: " + playerTwoName);

        while (play) {
            System.out.println("Remaining matches: " + p.remainingMatches);

            if (p.remainingMatches == 1) {
                System.out.println(winner + " wins, " + loser + " loses.");
                play = false;
            }

            // Player 1
            else if (firstPlayer) {
                //insert player here. h for human. c for computer
                int playerOneMove = h.move();
                String playerOneResult = h.result();

                if (playerOneMove > p.remainingMatches/2 || playerOneMove < 1) {
                    System.out.println("Sorry, illegal move.\nPlease choose at least one match and at most " + p.remainingMatches/2);
                }
                else {
                    System.out.println(playerOneResult);
                    winner = playerOneName;
                    loser = playerTwoName;
                    firstPlayer = false;
                }
            } //activePlayer 1

            // Player 2
            else {
                //insert player here. h for human. c for computer
                int playerTwoMove = h.move();
                String playerTwoResult = h.result();

                if (playerTwoMove > p.remainingMatches/2 || playerTwoMove < 1) {
                    System.out.println("Sorry, illegal move.\nPlease choose at least one match and at most " + p.remainingMatches/2);
                }
                else {
                    System.out.println(playerTwoResult);
                    winner = playerTwoName;
                    loser = playerOneName;
                    firstPlayer = true;
                }
            } //activePlayer 2



        }//while
    }
}
