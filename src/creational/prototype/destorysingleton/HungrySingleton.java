package creational.prototype.destorysingleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable, Cloneable {
    private final static HungrySingleton INSTACE;

    // 也可以直接在上一句new出来，只是熟悉一下，静态代码块也能够在初始化阶段进行类加载
    static {
        INSTACE = new HungrySingleton();
    }

    private HungrySingleton() {
        if (INSTACE != null) throw new RuntimeException("禁止反射构建单例对象");
    }

    public static HungrySingleton getInstace() {
        return INSTACE;
    }

    /**
     * 用来防止序列化对单例模式的破坏
     */
    private Object readResolve() {
        return INSTACE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return getInstace();
        return super.clone();
    }
}
