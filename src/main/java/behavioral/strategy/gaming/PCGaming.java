package behavioral.strategy.gaming;

import behavioral.strategy.GamingStrategy;

public class PCGaming implements GamingStrategy {

    @Override
    public void play() {
        System.out.println("Playing on PC!");
    }
}
