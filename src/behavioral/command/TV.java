package behavioral.command;

public class TV {
    private boolean flag;

    public TV(boolean flag) {
        this.flag = flag;
    }

    public void open() {
        if (flag) {
            System.out.println("TV已经打开过了");
        } else {
            flag = true;
            System.out.println("TV打开了");
        }
    }

    public void close() {
        if (!flag) {
            System.out.println("TV已经关闭了");
        } else {
            flag = false;
            System.out.println("TV关闭");
        }
    }
}
