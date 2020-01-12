package behavioral.strategy.gaming;

import behavioral.strategy.GamingStrategy;

public class MobileGaming implements GamingStrategy {

    @Override
    public void play() {
        System.out.println("Playing on mobile!");
    }
}
