package principle.liskovsubstitution.methodinput.before;

import java.util.HashMap;
import java.util.Map;

public class Base {
    public void func(Map Map) {
        System.out.println("父类Map被执行");
    }
}
