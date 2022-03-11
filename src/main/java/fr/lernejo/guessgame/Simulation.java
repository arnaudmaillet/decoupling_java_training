package fr.lernejo.guessgame;

import fr.lernejo.logger.*;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this.player = player;
        //TODO implement me
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
        //TODO implement me
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        logger.log("Donnez un nombre svp?");
        if (numberToGuess == player.askNextGuess()){
            return true;
        }
        this.player.respond(numberToGuess > player.askNextGuess());
        //TODO implement me
        return false;
    }

    public void loopUntilPlayerSucceed() {
        while (!nextRound()){};
    }
}
