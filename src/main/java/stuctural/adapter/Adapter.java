package stuctural.adapter;

public class Adapter implements Adaptee {

    private Input input;

    public Adapter(Input input) {
        this.input = input;
    }

    public void requestB() {
        System.out.println("Adapting TARGET.requestA() to ADAPTEE.requestB()");
        System.out.println("Call requestA() from Input.class by calling requestB() from Adaptee");
        input.requestA();
    }
}
