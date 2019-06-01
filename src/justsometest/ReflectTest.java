package justsometest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws NoSuchFieldException,
            IllegalAccessException, NoSuchMethodException,
            InvocationTargetException, InstantiationException {
        /**
         * public class User extends Person implements Serializable {
         *     private Integer age;
         *     private String name;
         *
         *     @Override
         *     Integer getAge() {
         *         return this.age;
         *     }
         *
         *     private void setAge(Integer age) {
         *         this.age = age;
         *     }
         *
         *     @Override
         *     String getName() {
         *         return this.name;
         *     }
         *
         *     private void setName(String name) {
         *         this.name = name;
         *     }
         * }
         */
        Method[] declaredMethods = User.class.getDeclaredMethods();
        // 在不知道一个类有哪些方法的情况下获取所有的方法
        for (int i = 0; i < declaredMethods.length; i++) {
            System.out.println(declaredMethods[i]);
        }
        // 在不知道一个类有哪些字段的情况下获取所有的字段
        Field[] declaredFields = User.class.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            System.out.println(declaredFields[i]);
        }
        Person user = new User();
        // 在知道一个类的字段后进行字段的设置
        Field field = User.class.getDeclaredField("age");
        // 私有字段可以通过set权限进行访问设置
        field.setAccessible(true);
        // 进行字段值的设置
        field.set(user, new Integer(3));

        // 在知道一个类中的方法名之后，其实就已经知道需要传入的参数列表了
        Method method1 = user.getClass().getDeclaredMethod("setAge", Integer.class);
        method1.setAccessible(true);
        // 但是这儿也可以对某个方法需要传入的参数进行访问
        Class<?>[] parameterTypes = method1.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            System.out.println(parameterTypes[i]);
        }
        // 进行方法执行,同时传入对应的参数长度，这儿是一个变长参数，传入方法所有需要的参数
        method1.invoke(user, 5555);
        Method method = User.class.getDeclaredMethod("getAge");
        Integer invokeRes = (Integer) method.invoke(user);
        System.out.println(invokeRes);
        // 获取该类直接实现的所有接口
        Class<?>[] interfaces = User.class.getInterfaces();
        for (int i = 0; i < interfaces.length; i++) {
            System.out.println(interfaces[i]);
        }
        // 反射创建一个对象，即使类似于饿汉式这种将构造函数设置为私有方法的类，也能够通过反射来进行构建
        Constructor constructor = User.class.getDeclaredConstructor();
        // constructor.setAccessible(true); 构造方法被设置为private时使用
        User instance = (User) constructor.newInstance();
        System.out.println(instance.getName());
    }
}
