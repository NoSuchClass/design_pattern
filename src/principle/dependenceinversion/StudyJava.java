package principle.dependenceinversion;

public class StudyJava implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("bitc在学习Java");
    }
}
