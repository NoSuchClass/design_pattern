package creational.singleton.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 这儿随手测试了两个东西：一个是enum类的赋值操作，一个是反射攻击Runtime这个类
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        EnumTest bob = EnumTest.valueOf("TTT");
//        System.out.println(bob == EnumTest.BOB);
        Constructor c = Runtime.class.getDeclaredConstructor();
        c.setAccessible(true);
        Runtime o = (Runtime) c.newInstance();
        System.out.println(o == Runtime.getRuntime());
        System.out.println(o.availableProcessors());
    }
}


