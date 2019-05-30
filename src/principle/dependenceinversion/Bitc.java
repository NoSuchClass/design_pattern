package principle.dependenceinversion;

public class Bitc {
    // v1
//    public void studyEP(){
//        System.out.println("bitc在学习前端课程");
//    }
//    public void studyPython(){
//        System.out.println("bitc在学习python课程");
//    }
//    // 由于在类设计上来说，Bitc属于低层，而MainTest属于高层，因为高层需要依赖低层的具体实现，就违反了依赖倒置原则
//    public void studyJava(){
//        System.out.println("bitc在学习Java课程");
//    }

    ICourse iCourse;

    // v2
//    public Bitc(ICourse iCourse){
//        this.iCourse = iCourse;
//    }
    public void studyCourse() {
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
