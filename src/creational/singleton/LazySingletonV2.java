package creational.singleton;

public class LazySingletonV2 {
    private static LazySingletonV2 lazySingleton = null;

    private LazySingletonV2() {
    }

    public synchronized static LazySingletonV2 getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingletonV2();
        }
        return lazySingleton;
    }
}
