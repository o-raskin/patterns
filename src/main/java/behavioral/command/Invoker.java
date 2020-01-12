package behavioral.command;

public class Invoker {

    public void executeCommand(Command command) {
        System.out.println("Invoker execute command");
        command.execute();
    }
}
