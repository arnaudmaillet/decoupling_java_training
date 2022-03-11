package fr.lernejo.guessgame;

import fr.lernejo.logger.*;

import java.util.Scanner;

public class HumanPlayer implements Player{
    Logger console = LoggerFactory.getLogger("player");
    public long askNextGuess(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }
    public void respond(boolean lowerOrGreater){
        if (lowerOrGreater){
            console.log("Plus grand");
        } else {
            console.log("Plus petit");
        }
    }
}
