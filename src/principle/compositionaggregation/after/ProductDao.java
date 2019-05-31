package principle.compositionaggregation.after;

public class ProductDao {
    DBConnection connection;

    ProductDao(DBConnection connection) {
        this.connection = connection;
    }

    public void addProduct() {
        String connection = this.connection.getConnection();
        System.out.println("通过" + connection + "获取连接");
    }
}
