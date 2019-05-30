package principle.openclose;

public class JavaCountCourse extends JavaCourse {

    public JavaCountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    //    这样写其实是违反了里式替换原则的，因为里式替换原则要求子类可以实现父类的抽象方法，但是不能够覆盖父类中非抽象方法
//    public Double getOrignalPrice(){
//        return super.getPrice();
//    }
//
//    @Override
//    public Double getPrice(){
//        return super.getPrice() * 0.8;
//    }
    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
