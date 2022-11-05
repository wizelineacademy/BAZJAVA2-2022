package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private final List<Command> operations
            = new ArrayList<>();

    public void executeOperation(Command command) {
        operations.add(command);
        command.execute();
    }
}
