package behavioral.observer.Guava;

import behavioral.observer.Guava.Course;
import behavioral.observer.Guava.Question;
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
    }


    @Subscribe
    public void subscribe(Object content) {
        System.out.println("执行subscribe方法，传入参数为" + content);
    }
}
