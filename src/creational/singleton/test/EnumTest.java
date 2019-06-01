package creational.singleton.test;

/**
 * // Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
 * // Jad home page: http://www.kpdus.com/jad.html
 * // Decompiler options: packimports(3)
 * // Source File Name:   EnumTest.java
 * <p>
 * package creational.singleton.test;
 * <p>
 * <p>
 * public final class EnumTest extends Enum
 * {
 * <p>
 * public static EnumTest[] values()
 * {
 * return (EnumTest[])$VALUES.clone();
 * }
 * <p>
 * public static EnumTest valueOf(String name)
 * {
 * return (EnumTest)Enum.valueOf(creational/singleton/test/EnumTest, name);
 * }
 * <p>
 * private EnumTest(String s, int i, String name, Integer age)
 * {
 * super(s, i);
 * this.age = age;
 * this.name = name;
 * }
 * <p>
 * public Integer getAge()
 * {
 * return age;
 * }
 * <p>
 * public String getName()
 * {
 * return name;
 * }
 * <p>
 * public static final EnumTest BOB;
 * public static final EnumTest TOM;
 * public static final EnumTest LILY;
 * private String name;
 * private Integer age;
 * private static final EnumTest $VALUES[];
 * <p>
 * static
 * {
 * BOB = new EnumTest("BOB", 0, "BOB T", Integer.valueOf(20));
 * TOM = new EnumTest("TOM", 1, "TOM S", Integer.valueOf(34));
 * LILY = new EnumTest("LILY", 2, "LILY Q", Integer.valueOf(22));
 * $VALUES = (new EnumTest[] {
 * BOB, TOM, LILY
 * });
 * }
 * }
 */

// 上面是关于枚举类为什么要这么写的原因，只是一个语法糖而已
public enum EnumTest {
    BOB("BOB T", 20),
    TOM("TOM S", 34),
    LILY("LILY Q", 22);
    private String name;
    private Integer age;

    EnumTest(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}


