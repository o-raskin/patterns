package behavioral.observer;

public class Application {

    /*
     * Observer
     *
     * 'Notify' other objects about state changes.
     **/
    public static void main(String[] args) {

        Publisher publisher = new Publisher("Pochta RF");

        Subscriber sub1 = new Subscriber("Oleg");
        Subscriber sub2 = new Subscriber("Dmitri");

        // try to alert someone
        publisher.alertAll();

        sub1.subscribe(publisher);
        sub2.subscribe(publisher);

        // try to alert again
        publisher.alertAll();
    }
}
