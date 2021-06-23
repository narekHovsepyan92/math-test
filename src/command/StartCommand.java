package command;

import data.Constants;

public class StartCommand implements Command {
    @Override
    public String getName() {
        return Constants.COMMAND_START;
    }

    @Override
    public void handle() {
        System.out.println("Command " + getName() + " Worked");
    }
}
