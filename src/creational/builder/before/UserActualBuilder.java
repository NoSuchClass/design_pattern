package creational.builder.before;

public class UserActualBuilder extends UserBuilder {
    private User user = new User();


    @Override
    void buildAge(Integer age) {
        user.setAge(age);
    }

    @Override
    void buildName(String name) {
        user.setName(name);
    }

    @Override
    void buildId(Long id) {
        user.setId(id);
    }

    @Override
    void buildHeight(Integer height) {
        user.setHeight(height);
    }

    @Override
    User makeUser() {
        return user;
    }
}
