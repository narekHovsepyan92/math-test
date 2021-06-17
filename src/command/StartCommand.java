package command;

import data.Constants;

public class StartCommand implements Command {
    @Override
    public String getName() {
        return Constants.COMMAND_START;
    }
}
