package behavioral.command;

public class Application {

    /*
    * Command
    *
    * Present requests like objects, use them as args in invokers.
    * Allow use requests in queue, log them or cancel.
    *
    * Example: all implementations of java.lang.Runnable
    **/
    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        Command command1 = new CommandA(receiver);
        Command command2 = new CommandB();

        invoker.executeCommand(command1);

        System.out.println();

        invoker.executeCommand(command2);
    }
}
