package behavioral.cor;

public class HandlerB implements Handler {

    @Override
    public void setNext(Handler handler) {
        throw new UnsupportedOperationException("B it is final handler");
    }

    @Override
    public void handle(Request request) {
        if (request.getInfo().equals("B")) {
            System.out.println("Handled with HANDLER_B");
        } else {
            throw new IllegalArgumentException("Request info is not supported!");
        }
    }
}
