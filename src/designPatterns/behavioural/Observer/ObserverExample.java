package designPatterns.behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String message);
}

// Observable Class
class NewsChannel {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : subscribers) {
            observer.update(message);
        }
    }
}

// Concrete Observer
class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

// Client
public class ObserverExample {
    public static void main(String[] args) {
        NewsChannel news = new NewsChannel();
        User alice = new User("Alice");
        User bob = new User("Bob");

        news.subscribe(alice);
        news.subscribe(bob);

        news.notifyObservers("Breaking News: Java 21 Released!");
    }
}
