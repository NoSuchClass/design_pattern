package principle.singleresponsibility;

/**
 * 这个接口实现了两个大的功能，获取课程信息和课程操作
 * 这个接口中存在的问题是：如果课程被退掉之后，就不能够获取课程信息了，因此拆分开来
 */
public interface ICourse {
    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();
}
