package creational.builder.before;

/**
 * 如果属性较多，那么将很容易写错参数顺序，有idea的提示还好，在没有提示的时候是
 * 非常令人头疼的
 */
public class MainTest {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.setUserBuilder(new UserActualBuilder());
        User bitc = userManager.makeUser("bitc", 21, 2341412541L, 33);
        System.out.println(bitc.toString());
    }
}
