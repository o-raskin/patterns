package behavioral.mediator;

public class Application {

    /*
     * Mediator
     *
     * Reducing classes connectivity by store all references inside itself
     **/
    public static void main(String[] args) {

        Mediator mediator = new MediatorImpl();

        ComponentA a = new ComponentA(mediator);
        ComponentB b = new ComponentB(mediator);

        mediator.setComponentA(a);
        mediator.setComponentB(b);

        a.execute();

        System.out.println();

        b.execute();
    }
}
