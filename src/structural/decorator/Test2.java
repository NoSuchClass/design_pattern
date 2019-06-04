package structural.decorator;

class Test2 {
    public static void main(String[] args) {
        AUser u = new User();
        u = new ChangeNameDecorator(u);
        u = new ChangeAgeDecorator(u);
        System.out.println(u.getAge() + "  " + u.getName());
    }
}