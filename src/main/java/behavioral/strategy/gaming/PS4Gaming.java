package behavioral.strategy.gaming;

import behavioral.strategy.GamingStrategy;

public class PS4Gaming implements GamingStrategy {

    @Override
    public void play() {
        System.out.println("Playing on PS4!");
    }
}
