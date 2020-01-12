package behavioral.strategy;

import behavioral.strategy.gaming.MobileGaming;
import behavioral.strategy.gaming.PCGaming;
import behavioral.strategy.gaming.PS4Gaming;

public class Game {

    private GamingStrategy strategy;

    public void play() {
        if (strategy == null) {
            throw new RuntimeException("Unknown gaming platform");
        }
        strategy.play();
    }

    public void setPlatform(String platform) {
        switch (platform) {
            case "PC":
                this.strategy = new PCGaming();
                break;
            case "PS4":
                this.strategy = new PS4Gaming();
                break;
            case "Mobile":
                this.strategy = new MobileGaming();
                break;
            default:
                throw new IllegalArgumentException(platform);
        }
    }
}
