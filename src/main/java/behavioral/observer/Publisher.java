package behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class Publisher {

    private String name;
    private Set<Subscriber> subscribers;

    public Publisher(String name) {
        this.name = name;
        this.subscribers = new HashSet<>();
    }

    void alertAll() {
        for(Subscriber sub : subscribers) {
            sub.alert();
        }
    }

    void follow(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    void unfollow(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public String getName() {
        return name;
    }
}
