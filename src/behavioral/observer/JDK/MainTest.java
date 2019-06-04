package behavioral.observer.JDK;

public class MainTest {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("Java");
        Teacher t = new Teacher();
        t.setName("tom");
        course.addObserver(t);

        Question question = new Question.QuestionBuilder().buildQuestionContent("为啥学Java").
                buildUserName("张珊").buildQuestion();

        course.produceQuestion(question);
        course.setName("Ptyhon");

        course.produceQuestion(question);
    }
}
