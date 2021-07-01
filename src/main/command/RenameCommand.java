package main.command;

import main.data.Constants;

public class RenameCommand implements Command{

    @Override
    public String getName() {
        return Constants.COMMAND_RENAME;
    }

    @Override
    public void handle() {
        System.out.println("Command " + getName() + " Worked");
    }
}
