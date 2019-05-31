package creational.abstractfactory;

public class JavaCourseFactory extends CourseFactory {
    @Override
    Article getArticle() {
        return new JavaArticle();
    }

    @Override
    Video getVideo() {
        return new JavaVideo();
    }
}
