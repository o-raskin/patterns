package behavioral.mediator;

public class ComponentA implements Component {

    private Mediator mediator;

    public ComponentA(Mediator mediator) {
        this.mediator = mediator;
    }

    public void execute() {
        System.out.println("execute A");
        mediator.execute(this);
    }

    public void printAMessage() {
        System.out.println("printing A");
    }
}
