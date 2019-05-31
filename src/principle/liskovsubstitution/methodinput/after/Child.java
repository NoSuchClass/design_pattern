package principle.liskovsubstitution.methodinput.after;

import java.util.Map;

public class Child extends Base {
//    @Override
//    public void func(HashMap hashMap) {
//        System.out.println("子类hashmap入参方法执行");
//    }

    public void func(Map map) {
        System.out.println("子类map入参方法被执行");
    }
}
