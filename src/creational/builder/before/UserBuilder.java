package creational.builder.before;

public abstract class UserBuilder {
    abstract void buildAge(Integer age);

    abstract void buildName(String name);

    abstract void buildId(Long id);

    abstract void buildHeight(Integer height);

    abstract User makeUser();
}
