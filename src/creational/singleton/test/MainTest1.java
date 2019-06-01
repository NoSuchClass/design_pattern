package creational.singleton.test;

import creational.singleton.LazySingletonV1;

public class MainTest1 {
    public static void func() {
        LazySingletonV1 instance = LazySingletonV1.getInstance();
        System.out.println(instance.toString());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            func();
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            func();
        });
        t2.start();
    }
}
