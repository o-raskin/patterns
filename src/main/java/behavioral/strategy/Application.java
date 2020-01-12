package behavioral.strategy;

public class Application {

    /*
     * Strategy
     *
     * Family related algorithms can replaced in runtime.
     *
     * Feature: Some class delegate choosing and executing inner object (interface or abstract class)
     **/
    public static void main(String[] args) {

        Game game = new Game();

        game.setPlatform("PC");
        game.play();

        game.setPlatform("PS4");
        game.play();

        game.setPlatform("Mobile");
        game.play();
    }
}
