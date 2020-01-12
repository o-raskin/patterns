package behavioral.command;

public class CommandA implements Command {

    private Receiver receiver;

    public CommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.receive("A");
    }
}
