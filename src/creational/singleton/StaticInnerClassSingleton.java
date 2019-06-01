package creational.singleton;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        if (InnerClass.instance != null) throw new RuntimeException("禁止反射构建单例对象");
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

    /**
     * 相当于独立new了一个class出来，并且所有new 出来的StaticInnerClassSingleton获取到的内部类都是
     * 这一个InnerClass
     */
    private static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }
}
