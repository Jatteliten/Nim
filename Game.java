// Daniel Isaksson
// Daniel.isaksson90@gmail.com
package Nim;

public class Game {

    public void playGame(int matches){
        //creates variables for displayed win-message
        String winner = null;
        String loser = null;

        Humanplayer human = new Humanplayer();
        Computerplayer computer = new Computerplayer();

        //insert player here. human for human player. computer for computer player.
        String playerOneName = human.getName();
        String playerTwoName = computer.getName();

        // create new pile of matches. Set number of matches from program execution.
        Pile pile = new Pile();
        pile.setRemainingMatches(matches);
        //boolean for while-loop
        boolean play = true;
        //boolean for player selection
        boolean firstPlayer = true;

            System.out.println("Welcome to Nm\nPlayer 1: " + playerOneName + "\nPlayer 2: " + playerTwoName);

        while (play) {
            pile.setRemainingMatches(pile.getRemainingMatches() - pile.getMatchesTaken());
            System.out.println("Remaining matches: " + pile.getRemainingMatches());

            if (pile.getRemainingMatches() == 1) {
                //Displays winner and ends program
                System.out.println(winner + " wins, " + loser + " loses.");
                break;
            }

            // Player 1
            while (firstPlayer) {
                //Insert player here. human for human player. computer for computer player.
                int playerOneMove = human.move(pile);
                String playerOneResult = human.result(pile);

                if (playerOneMove > pile.getRemainingMatches() / 2 || playerOneMove <= 0) {
                    //Restarts turn if match removed total is not allowed
                    System.out.println("Sorry, illegal move.\nPlease choose at least one match and at most " + pile.getRemainingMatches() / 2);
                    pile.setRemainingMatches(pile.getRemainingMatches() + pile.getMatchesTaken());
                }
                else {
                    //Change number of remaining matches. Change winner
                    System.out.println(playerOneResult);
                    winner = playerOneName;
                    loser = playerTwoName;
                    firstPlayer = false;
                }
            } //while player 1

            // Player 2
            while (!firstPlayer) {
                //Insert player here. human for human player. computer for computer player.
                int playerTwoMove = computer.move(pile);
                String playerTwoResult = computer.result(pile);

                if (playerTwoMove > pile.getRemainingMatches()/2 || playerTwoMove <= 0) {
                    //Restarts turn if match removed total is not allowed
                    System.out.println("Sorry, illegal move.\nPlease choose at least one match and at most " + pile.getRemainingMatches()/2);
                    pile.setRemainingMatches(pile.getRemainingMatches() + pile.getMatchesTaken());
                }
                else {
                    //Change number of remaining matches. Change winner
                    System.out.println(playerTwoResult);
                    winner = playerTwoName;
                    loser = playerOneName;
                    firstPlayer = true;
                }
            } //while player 2



        } //while
    }
}
