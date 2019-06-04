package structural.decorator;

import structural.decorator.v2.ABattercake;
import structural.decorator.v2.AbstractDecorator;

public class ChangeNameDecorator extends AbstractUserDecorator {

    @Override
    public String getName() {
        return "使用了成长药水的" + super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge() + 10;
    }

    public ChangeNameDecorator(AUser user) {
        super(user);
    }
}
