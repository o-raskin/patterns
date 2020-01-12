package behavioral.cor;

public class Application {

    /*
     * Chain of responsibility
     *
     * Allows pass requests through chain of handlers.
     **/
    public static void main(String[] args) {

        Handler handler1 = new HandlerA();
        handler1.setNext(new HandlerB());

        Request request1 = new Request("A");
        handler1.handle(request1);

        Request request2 = new Request("B");
        handler1.handle(request2);

    }
}
