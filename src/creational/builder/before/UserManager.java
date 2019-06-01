package creational.builder.before;

public class UserManager {
    private UserBuilder userBuilder;

    public void setUserBuilder(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    public User makeUser(String name, Integer age, Long id, Integer height) {
        userBuilder.buildAge(age);
        userBuilder.buildId(id);
        userBuilder.buildName(name);
        userBuilder.buildHeight(height);
        return userBuilder.makeUser();
    }
}
