package creational.prototype;

public class Mail implements Cloneable {
    private String name;
    private String mail;
    private String content;

    public Mail() {
        System.out.println("mail constructor");
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone start...");
        return super.clone();
    }
}
