package behavioral.mediator;

public interface Mediator {

    void execute(Component componentObj);

    void setComponentA(ComponentA a);

    void setComponentB(ComponentB b);
}
