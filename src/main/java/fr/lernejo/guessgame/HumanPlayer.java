package fr.lernejo.guessgame;

import fr.lernejo.logger.*;

import java.util.Scanner;

public class HumanPlayer implements Player{
    Logger console = LoggerFactory.getLogger("player");
    Scanner sc = new Scanner(System.in);
    public long askNextGuess(){
        long num = sc.nextLong();
        return num;
    }
    public void respond(boolean lowerOrGreater){
        if (lowerOrGreater){
            console.log("Plus grand");
        } else {
            console.log("Plus petit");
        }
    }
}
