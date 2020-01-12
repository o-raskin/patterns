package behavioral.cor;

public class HandlerA implements Handler {

    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(Request request) {
        if (request.getInfo().equals("A")) {
            System.out.println("Handled with HANDLER_A");
        } else {
            nextHandler.handle(request);
        }
    }
}
