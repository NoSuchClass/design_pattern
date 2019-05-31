package principle.liskovsubstitution.before;

/**
 * 这儿给一个业务场景：如果宽度小于等于长度，那么让宽度+1
 * 如果按照里式替换原则，这个业务场景下如果父类没有问题，那么子类也不应该有问题
 * <p>
 * 但是现在很明显传入子类时不能够与父类表示相同的正确性，因此违背了里氏替换原则，即子类
 * 可以拓展父类的方法，但是不能够覆盖父类的方法（可以实现抽象方法）
 */
public class MainTest {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("现在的值是：" + rectangle.getWidth() + "  " + rectangle.getLength());
        }
        System.out.println("resize over");
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Square square = new Square(5, 5);
        //     resize(rectangle);
        resize(square);
    }
}
