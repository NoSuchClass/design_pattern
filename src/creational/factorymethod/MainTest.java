package creational.factorymethod;

public class MainTest {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
