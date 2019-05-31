package creational.abstractfactory;

public class JavaArticle extends Article {
    @Override
    protected void produce() {
        System.out.println("java article...");
    }
}
