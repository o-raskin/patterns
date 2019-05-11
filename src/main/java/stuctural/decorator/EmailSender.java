package stuctural.decorator;

public class EmailSender implements Sender{

    private Sender sender;

    public EmailSender() {
    }

    public EmailSender(Sender sender) {
        this.sender = sender;
    }

    public void send() {
        if (sender != null) {
            sender.send();
        }
        System.out.println("EMAIL SEND");
    }
}
