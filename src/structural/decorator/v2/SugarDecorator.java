package structural.decorator.v2;

public class SugarDecorator extends AbstractDecorator {

    @Override
    protected void doSomething() {

    }

    public SugarDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加很贵的糖 ";
    }

    @Override
    protected int cost() {
        return super.cost() + 100;
    }
}
