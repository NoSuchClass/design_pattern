package creational.builder.after;

public class User {
    private String name;
    private Integer age;
    private Long id;
    private Integer height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", height=" + height +
                '}';
    }

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.height = userBuilder.height;
        this.id = userBuilder.id;
    }

    public static class UserBuilder {
        private String name;
        private Integer age;
        private Long id;
        private Integer height;

        UserBuilder buildAge(Integer age) {
            this.age = age;
            return this;
        }

        UserBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        UserBuilder buildId(Long id) {
            this.id = id;
            return this;
        }

        UserBuilder buildHeight(Integer height) {
            this.height = height;
            return this;
        }

        User buildUser() {
            return new User(this);
        }
    }
}
