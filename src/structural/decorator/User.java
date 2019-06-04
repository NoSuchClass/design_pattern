package structural.decorator;

public class User implements AUser {
    @Override
    public String getName() {
        return "婴儿";
    }

    @Override
    public int getAge() {
        return 1;
    }
}
