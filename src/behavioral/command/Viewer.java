package behavioral.command;

import java.util.ArrayList;

public class Viewer {
    ArrayList<Command> commands = new ArrayList<>();

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }
}
