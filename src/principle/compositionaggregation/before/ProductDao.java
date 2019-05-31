package principle.compositionaggregation.before;

public class ProductDao extends DBConnection {
    public void addProduct() {
        String conn = super.getConnection();
        System.out.println("通过" + conn + "获取连接");
    }
}
