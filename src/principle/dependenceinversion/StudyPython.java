package principle.dependenceinversion;

public class StudyPython implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("bitc在学习Python");
    }
}
