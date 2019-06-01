package creational.singleton;

/**
 * 单线程模式下ok，多线程模式下可能会获取多个对象
 */
public class LazySingletonV1 {
    private static LazySingletonV1 lazySingleton = null;
    private static boolean flag = true;

    private LazySingletonV1() {
        // q2代码
        if (flag) {
            flag = false;
        } else {
            // q1代码
            throw new RuntimeException("禁止反射创建单例对象");
        }
    }

    public static LazySingletonV1 getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingletonV1();
        }
        return lazySingleton;
    }
}
