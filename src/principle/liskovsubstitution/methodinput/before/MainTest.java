package principle.liskovsubstitution.methodinput.before;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * 主要就是如果子类重载的范围较小，在传入与父类相同参数的时候会出现不一致的结果
 * 而如果子类重载的范围更大的话，传入与父类相同的参数时，会优先执行与父类向匹配的方法
 */
public class MainTest {
    public static void main(String[] args) {
        Child child = new Child();
        Base base = new Base();
        child.func(new HashMap());
        base.func(new HashMap());
    }
}
