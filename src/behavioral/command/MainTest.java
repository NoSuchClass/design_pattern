package behavioral.command;

public class MainTest {
    public static void main(String[] args) {
        TV tv = new TV(false); // 默认电视关闭
        OpenTVExecuter openTVExecuter = new OpenTVExecuter(tv);
        CloseTVExecutor closeTVExecutor = new CloseTVExecutor(tv);
        Viewer viewer = new Viewer();
        // 可以复用任务
        viewer.addCommand(openTVExecuter);
        viewer.addCommand(openTVExecuter);
        viewer.addCommand(closeTVExecutor);
        viewer.addCommand(closeTVExecutor);
        viewer.executeCommands();
    }
}
