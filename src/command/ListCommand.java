package command;

import data.Constants;

public class ListCommand implements Command{
    @Override
    public String getName() {
        return Constants.COMMAND_LIST;
    }

    @Override
    public void handle() {
        System.out.println("Command " + getName() + " Worked");
    }
}
