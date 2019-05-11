package stuctural.decorator;

public class TwitchSender implements Sender {

    private Sender sender;

    public TwitchSender() {
    }

    public TwitchSender(Sender sender) {
        this.sender = sender;
    }

    public void send() {
        if (sender != null) {
            sender.send();
        }
        System.out.println("TWITCH SEND");
    }
}
