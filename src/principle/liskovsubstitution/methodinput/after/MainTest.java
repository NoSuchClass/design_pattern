package principle.liskovsubstitution.methodinput.after;

import java.util.HashMap;

public class MainTest {
    public static void main(String[] args) {
        Base child = new Child();
        child.func(new HashMap());
    }
}
