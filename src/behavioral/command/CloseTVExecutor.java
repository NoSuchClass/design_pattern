package behavioral.command;

public class CloseTVExecutor implements Command {
    TV tv;

    public CloseTVExecutor(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.close();
    }
}
