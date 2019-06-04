package behavioral.observer.Guava;

public class MainTest {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("Java");
        Teacher t = new Teacher();
        t.setName("tom");
        course.addObserver(t);

        Question question = new Question();
        question.setUserName("张三");
        question.setQuestionContent("为啥要学Java");

        course.produceQuestion(question);
        course.setName("Ptyhon");

        course.produceQuestion(question);
    }
}
