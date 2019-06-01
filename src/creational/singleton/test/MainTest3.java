package creational.singleton.test;

import creational.singleton.HungrySingleton;

import java.io.*;

/**
 * 关于序列化破坏单例模式的测试
 */
public class MainTest3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton instace = HungrySingleton.getInstace();

        System.out.println(instace);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test221"));
        oos.writeObject(instace);
        File file = new File("test221");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton readObject = (HungrySingleton) ois.readObject();
        System.out.println(readObject);
        System.out.println(readObject == instace);
    }
}
