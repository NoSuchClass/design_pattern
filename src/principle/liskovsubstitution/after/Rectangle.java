package principle.liskovsubstitution.after;

public class Rectangle implements Quadrangle {
    private Integer length;
    private Integer width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Integer getWidth() {
        return this.width;
    }

    @Override
    public Integer getLength() {
        return this.length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
