package creational.abstractfactory;

public class PythonCourseFactory extends CourseFactory {
    @Override
    Article getArticle() {
        return new PythonArticle();
    }

    @Override
    Video getVideo() {
        return new PythonVideo();
    }
}
