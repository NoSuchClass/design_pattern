package creational.builder.after;

/**
 * 这儿就可以提供链式调用的方式，比如在某些属性比较多，而且有默认值的时候，就可以调用部分
 * build方法进行构建
 */
public class MainTest {
    public static void main(String[] args) {
        User user = new User.UserBuilder().buildAge(12).buildHeight(1).
                buildId(232L).buildName("刘").buildUser();
        System.out.println(user.toString());
    }
}
