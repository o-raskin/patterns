package stuctural.decorator;

public class VKSender implements Sender {

    private Sender sender;

    public VKSender() {
    }

    public VKSender(Sender sender) {
        this.sender = sender;
    }

    public void send() {
        if (sender != null) {
            sender.send();
        }
        System.out.println("VK SEND");
    }
}
