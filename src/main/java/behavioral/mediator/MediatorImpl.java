package behavioral.mediator;

public class MediatorImpl implements Mediator {

    private ComponentA componentA;
    private ComponentB componentB;

    @Override
    public void execute(Component component) {
        if (component instanceof ComponentA) {
            componentB.printBMessage();
        } else if (component instanceof ComponentB) {
            componentA.printAMessage();
        }
    }

    public void setComponentA(ComponentA componentA) {
        this.componentA = componentA;
    }

    public void setComponentB(ComponentB componentB) {
        this.componentB = componentB;
    }
}
