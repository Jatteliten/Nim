package Nim2;
import java.util.Scanner;
    public class Humanplayer extends Game{
        String name = "Human";
        String callOut = "there are x matches left. Your move";
        Scanner scan = new Scanner(System.in);
        String move = scan.nextLine();
        String result = "You remove " + move +" matches";

} //Human player

