package creational.singleton;

public class LazySingletonV3DoubleCheck {
    // 防止指令重排序，导致某个线程获取到null对象（即未进行初始化的对象，仅进行了内存划分和引用交付）
    private static volatile LazySingletonV3DoubleCheck lazySingleton = null;

    private LazySingletonV3DoubleCheck() {
    }

    public static LazySingletonV3DoubleCheck getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingletonV3DoubleCheck.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingletonV3DoubleCheck();
                }
            }
        }
        return lazySingleton;
    }
}
