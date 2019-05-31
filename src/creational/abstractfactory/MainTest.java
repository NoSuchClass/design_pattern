package creational.abstractfactory;

/**
 * 比如现在一节课需要上传一个video和article才能算作一节课，这样的话video和article就是
 * 同一个产品族的，因此将他们的构建方法抽象出来，构建一个CourseFactory的抽象工厂
 */
public class MainTest {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        Article article = javaCourseFactory.getArticle();
        Video video = javaCourseFactory.getVideo();
        article.produce();
        video.produce();
    }
}
