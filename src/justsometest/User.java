package justsometest;

import java.io.Serializable;

public class User extends Person implements Serializable {
    private Integer age;
    private String name;

    @Override
    Integer getAge() {
        return this.age;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    @Override
    String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
