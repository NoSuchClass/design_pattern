package principle.liskovsubstitution.methodinput.before;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {
//    public void func(HashMap hashMap){
//        System.out.println("子类hashMap入参方法被执行");
//    }

    public void func(HashMap hashMap) {
        System.out.println("子类hashMap入参方法被执行");
    }
}
