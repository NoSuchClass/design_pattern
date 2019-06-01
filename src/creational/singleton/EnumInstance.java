package creational.singleton;

public enum EnumInstance {
    INSTANCE;
    private Object date;

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public EnumInstance getInstace() {
        return INSTANCE;
    }
}

