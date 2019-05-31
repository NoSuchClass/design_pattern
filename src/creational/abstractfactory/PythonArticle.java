package creational.abstractfactory;

public class PythonArticle extends Article {
    @Override
    protected void produce() {
        System.out.println("python article...");
    }
}
