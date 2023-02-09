package Nim2;

public class Game {

    public void playGame() {

        String winner = "";
        String loser = "";

        Humanplayer human = new Humanplayer();
        Computerplayer computer = new Computerplayer();

        Pile p = new Pile();

        p.setRemainingMatches(100);

        boolean firstPlayer = true;
        boolean play = true;

        System.out.println("Welcome to Nm\nPlayer 1: " + human.getName() + "\nPlayer 2: " + computer.getName());

        while (play) {
            p.setRemainingMatches(p.getRemainingMatches() - p.getMatchesTaken());
            System.out.println("Remaining matches: " + p.getRemainingMatches());

            if (p.getRemainingMatches() == 1) {
                System.out.println(winner + " wins, " + loser + " loses.");
                play = false;
            }

            // Player 1
            else if (firstPlayer) {
                // insert player here. h for human. c for computer
                int playerOneMove = human.move(p);
                String playerOneResult = human.result(p);

                if (playerOneMove > p.getRemainingMatches() / 2 || playerOneMove <= 0) {
                    System.out.println("Sorry, illegal move.\nPlease choose at least one match and at most "
                            + p.getRemainingMatches() / 2);
                    p.setRemainingMatches(p.getRemainingMatches() + p.getMatchesTaken());
                } else {
                    System.out.println(playerOneResult);
                    winner = human.getName();
                    loser = computer.getName();
                    firstPlayer = false;
                }
            } // activePlayer 1

            // Player 2
            else {
                // insert player here. h for human. c for computer
                int playerTwoMove = computer.move(p);
                String playerTwoResult = computer.result(p);

                if (playerTwoMove > p.getRemainingMatches() / 2 || playerTwoMove <= 0) {
                    System.out.println("Sorry, illegal move.\nPlease choose at least one match and at most "
                            + p.getRemainingMatches() / 2);
                    p.setRemainingMatches(p.getRemainingMatches() + p.getMatchesTaken());
                } else {
                    System.out.println(playerTwoResult);
                    winner = computer.getName();
                    loser = human.getName();
                    firstPlayer = true;
                }
            } // activePlayer 2

        } // while
    }
}
