package principle.compositionaggregation.after;

public class NoSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "NoSQL连接";
    }
}
