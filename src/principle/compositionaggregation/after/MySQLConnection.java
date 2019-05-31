package principle.compositionaggregation.after;

public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL连接";
    }
}
