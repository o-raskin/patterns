package stuctural.adapter;

public class Application {

    /*
     *      Adapter - Client code
     *
     *      Use existing ADAPTEE interface to wrap TARGET interface and use it inside.
     */
    public static void main(String[] args) {

        // our INPUT interface
        Input input = new InputImpl();

        // our ADAPTEE interface with WRAPPER 'ADAPTER' of INPUT object
        Adaptee adaptee = new Adapter(input);

        // call
        adaptee.requestB();
    }
}
