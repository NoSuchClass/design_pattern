package principle.liskovsubstitution.after;

public class Square implements Quadrangle {
    private Integer sideLength;

    public Square(Integer sideLength, Integer sideLength2) {
        this.sideLength = sideLength;
    }

    public Square(int i, int i1) {
    }

    @Override
    public Integer getWidth() {
        return sideLength;
    }

    @Override
    public Integer getLength() {
        return sideLength;
    }

    public void setSideLength(Integer sideLength) {
        this.sideLength = sideLength;
    }
}
