package principle.liskovsubstitution.before;

public class Square extends Rectangle {
    private Integer width;
    private Integer length;

    @Override
    public Integer getLength() {
        return this.length;
    }

    @Override
    public Integer getWidth() {
        return this.width;
    }

    public Square(Integer width, Integer length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void setLength(Integer length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(Integer width) {
        this.width = width;
        this.length = width;
    }
}
