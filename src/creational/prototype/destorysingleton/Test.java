package creational.prototype.destorysingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射和克隆，也可以使单例破坏
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingleton singleton = HungrySingleton.getInstace();
        Method method = HungrySingleton.class.getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton cloneSingleton = (HungrySingleton) method.invoke(singleton);
        System.out.println(singleton);
        System.out.println(cloneSingleton);
    }
}
