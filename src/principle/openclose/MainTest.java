package principle.openclose;

/**
 * 开闭原则：对修改关闭，对拓展开放。
 * 这儿如果要实现一个课程打八折同时显示原价的业务的话，可以在接口中添加一个新的八折方法，然后修改对应的类
 * 但是，如果类特别多的话，会很大几率出错，并且浪费人力物力
 * 因此可以继承JavaCourse类，写一个JavaCountCourse
 */
public class MainTest {
    public static void main(String[] args) {
/*        ICourse javaCourse = new JavaCourse(96, "Java高并发", 66d);
        System.out.println(javaCourse.getPrice());*/
        ICourse courseourse = new JavaCountCourse(96, "Java高并发", 66d);
        JavaCountCourse javaCountCourse = (JavaCountCourse) courseourse;
//        System.out.println(javaCountCourse.getPrice() + " 原价：" + javaCountCourse.getOrignalPrice());
        // 遵循里式替换原则后
        System.out.println(javaCountCourse.getPrice() + "打折后：" + javaCountCourse.getDiscountPrice());
    }
}
