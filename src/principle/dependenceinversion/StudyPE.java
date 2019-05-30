package principle.dependenceinversion;

public class StudyPE implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("bitc在学习PE");
    }
}
