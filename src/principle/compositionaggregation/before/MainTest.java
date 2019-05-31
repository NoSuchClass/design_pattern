package principle.compositionaggregation.before;

/**
 * 这儿就是组合关系，如果DBConnection不存在了，那么该类功能就不能够使用了
 */
public class MainTest {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.addProduct();
    }
}
