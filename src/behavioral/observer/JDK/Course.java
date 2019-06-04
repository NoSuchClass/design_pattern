package behavioral.observer.JDK;

import com.google.common.eventbus.EventBus;

import java.util.Observable;

public class Course extends Observable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void produceQuestion(Question question) {
        setChanged();
        notifyObservers(question);
    }

}
