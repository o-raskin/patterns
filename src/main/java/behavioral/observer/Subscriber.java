package behavioral.observer;

public class Subscriber {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void subscribe(Publisher publisher) {
        System.out.println(this.name + " start following " + publisher.getName());
        publisher.follow(this);
    }

    public void alert() {
        System.out.println("Subscriber '" + name + "' notified!");
    }
}
