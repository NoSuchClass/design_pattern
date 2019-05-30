package principle.interfacesegregation;

// 如果直接实现IAnimalAction接口会违反接口隔离原则
public class Bird implements IFlyAnimalAction, IEatAnimalAction {

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }
}
