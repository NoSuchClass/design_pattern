package behavioral.command;

public class OpenTVExecuter implements Command {
    TV tv;

    public OpenTVExecuter(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.open();
    }
}
