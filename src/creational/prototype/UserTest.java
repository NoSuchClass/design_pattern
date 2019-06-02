package creational.prototype;

import java.util.Date;

public class UserTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.setLoadTime(new Date(0L));
        user.setName("bob");
        System.out.println(user.toString());
        User user1 = (User) user.clone();
        System.out.println("克隆：" + user1.toString());
        user.setName("tom");
        // 如果直接修改引用成员变量所在地址的值的话，会直接影响克隆后的值
        user.getLoadTime().setTime(555885885);
        System.out.println(user.toString());
        System.out.println("克隆：" + user1.toString());
    }
}
