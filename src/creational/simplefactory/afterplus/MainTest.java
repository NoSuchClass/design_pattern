package creational.simplefactory.afterplus;

/**
 * 通过对工厂代码的改写， 能够从一定程度上满足开闭原则
 * 因为后面如果需要新添加课程video的时候，不需要修改工厂
 */
public class MainTest {
    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo(PythonVideo.class);
        video.produce();
    }

}
