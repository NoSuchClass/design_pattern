package creational.singleton.test;

import creational.singleton.HungrySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 关于预防反射攻击的测试
 */
public class MainTest4 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<HungrySingleton> clazz = HungrySingleton.class;
        Constructor<HungrySingleton> c = clazz.getDeclaredConstructor();
        c.setAccessible(true);
        HungrySingleton singleton1 = HungrySingleton.getInstace();
        System.out.println(singleton1);
        HungrySingleton singleton2 = c.newInstance();
        System.out.println(singleton2);
    }
}
