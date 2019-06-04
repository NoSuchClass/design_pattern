package behavioral.observer.Guava;

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
        EventBus eventBus = new EventBus();
        Teacher teacher = new Teacher();
        eventBus.register(teacher);
        eventBus.post(question.getQuestionContent());
    }

}
