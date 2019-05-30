package principle.dependenceinversion;

public class MainTest {
    public static void main(String[] args) {
        // v1 违反了依赖倒置原则
        Bitc bitc = new Bitc();
//        bitc.studyEP();
//        bitc.studyPython();
//        // 这个时候如果还需要学习Java课程，那么就需要在Bitc这个类中添加一个studyJava的方法
//        bitc.studyJava();

        // v2 通过方法注入对应的课程学习动作，高层模块
//        bitc.studyCourse(new StudyJava());
//        bitc.studyCourse(new StudyPE());
//        bitc.studyCourse(new StudyPython());

        //v3 通过构造器注入，这时不是特别方便，因为如果bitc如果还想学别的，那么就还需要new，
        // 这个的运用场景一般是在Spring这种单例模式下，只需要注入一次即可
//        Bitc bitc = new Bitc(new StudyPython());
//        bitc.studyCourse();

        //v4 开放ICourse的设置
        bitc.setiCourse(new StudyPython());
        bitc.studyCourse();
        bitc.setiCourse(new StudyPE());
        bitc.studyCourse();
    }
}
