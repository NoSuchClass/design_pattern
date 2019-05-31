package creational.simplefactory.after;

public class MainTest {
    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo("pYthon");
        if (video != null) {
            video.produce();
        } else {
            return;
        }
    }

}
