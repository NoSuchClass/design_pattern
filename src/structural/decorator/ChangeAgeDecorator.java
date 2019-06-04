package structural.decorator;

public class ChangeAgeDecorator extends AbstractUserDecorator {
    public ChangeAgeDecorator(AUser user) {
        super(user);
    }

    @Override
    public String getName() {
        return "使用了年龄药水的" + super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge() + 10000;
    }
}
