package behavioral.mediator;

public class ComponentB implements Component {

    private Mediator mediator;

    public ComponentB(Mediator mediator) {
        this.mediator = mediator;
    }

    public void execute() {
        System.out.println("execute B");
        mediator.execute(this);
    }

    public void printBMessage() {
        System.out.println("printing B");
    }
}
