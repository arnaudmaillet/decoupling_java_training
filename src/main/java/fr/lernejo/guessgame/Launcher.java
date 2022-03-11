package fr.lernejo.guessgame;

public class Launcher {
    public static void main(String[] arcs){
        Configuration configuration = Configuration.parseArg(arcs);
        Simulation simulation = new Simulation(configuration.player);
        simulation.initialize(configuration.numberToGuess);
        simulation.loopUntilPlayerSucceed(100);
    }
}
