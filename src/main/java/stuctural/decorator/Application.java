package stuctural.decorator;

public class Application {


    /*
     *      Decorator - Client code
     *
     *
     *      Allow us to add new functional by using wrappers.
     *
     *      We are using same classes instead create a lot of with mixed functional.
     */
    public static void main(String[] args) {

        // arrange
        Sender sender = new EmailSender();

        // we want to send messages to VK besides Emails
        sender = new VKSender(sender);

        // AND THEN we want to send into TWITCH
        sender = new TwitchSender(sender);



        // act
        sender.send();

    }
}
