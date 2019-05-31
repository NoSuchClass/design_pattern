package principle.liskovsubstitution.methodinput.after;

import java.util.HashMap;

public class Base {
    public void func(HashMap hashMap) {
        System.out.println("父类hashMap被执行");
    }
}
