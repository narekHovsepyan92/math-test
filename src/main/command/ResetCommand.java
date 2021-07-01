package main.command;

import main.data.Constants;

public class ResetCommand implements Command{
    @Override
    public String getName() {
        return Constants.COMMAND_RESET;
    }

    @Override
    public void handle() {
        System.out.println("Command " + getName() + " Worked");
    }
}
