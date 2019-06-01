package creational.singleton.test;

import creational.singleton.LazySingletonV1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 测试懒汉式能否通过前面的方法进行反射攻击防御
 * <p>
 * 利用V1先进行测试，先是q1代码
 */
public class MainTest5 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//          第一次测试失败，不能够防止反射创建单例对象
//        Constructor c = LazySingletonV1.class.getDeclaredConstructor();
//        c.setAccessible(true);
//        Object o = c.newInstance();
//        System.out.println(o);
        // 第二次测试
        Constructor c = LazySingletonV1.class.getDeclaredConstructor();
        c.setAccessible(true);
        Object o = c.newInstance();
        System.out.println(o);
    }
}
