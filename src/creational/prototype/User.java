package creational.prototype;

import java.util.Date;

public class User implements Cloneable {
    String name;
    Date loadTime;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", loadTime=" + loadTime +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Date loadTime) {
        this.loadTime = loadTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 深克隆
        User cloneUser = (User) super.clone();
        cloneUser.loadTime = (Date) this.loadTime.clone();
        return cloneUser;
    }
}
