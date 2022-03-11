package fr.lernejo.guessgame;

import fr.lernejo.logger.*;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }
    private boolean nextRound() {
        if (player.getClass() == HumanPlayer.class){
            logger.log("Donnez un nombre svp?");
        }
        long guess = player.askNextGuess();
        if (numberToGuess == guess){
            logger.log("Vous avez trouvé");
            return true;
        }
        this.player.respond(numberToGuess > guess);
        return false;
    }

    public void loopUntilPlayerSucceed(long nb) {
        long i = 0;
        long start = System.currentTimeMillis();
        while (i != nb){
            if (nextRound()){
                break;
            }
            i++;
        }
        long end = System.currentTimeMillis();
        
        logger.log("Temps écoulé : " + Long.toString((end - start/1000)%60) + " secondes");
    }
}
