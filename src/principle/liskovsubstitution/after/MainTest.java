package principle.liskovsubstitution.after;

/**
 * 这儿相当于添加了约束，同时能够满足里式替换原则
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
        resize(rectangle);
        // resize(square); 这时候由于Quadrangle未实现set方法，因此不能够传入square类型，而只能传入Rectangle类型，
        // 这就给了方法一个约束
    }
}
