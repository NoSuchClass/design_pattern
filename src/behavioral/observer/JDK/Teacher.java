package behavioral.observer.JDK;

import com.google.common.eventbus.Subscribe;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Question question = (Question) arg;
        Course course = (Course) o;

        System.out.println(question.userName + "在这门叫" + course.getName() + "的课上" + "提了一个" + question.getQuestionContent() + "的问题");
    }
}
