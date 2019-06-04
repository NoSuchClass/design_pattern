package structural.decorator;

public abstract class AbstractUserDecorator implements AUser {
    private AUser user;

    public AbstractUserDecorator(AUser user) {
        this.user = user;
    }

    @Override
    public String getName() {
        return user.getName();
    }

    @Override
    public int getAge() {
        return user.getAge();
    }
}
