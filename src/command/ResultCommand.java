package command;

import data.Constants;

public class ResultCommand implements Command{
    @Override
    public String getName() {
        return Constants.COMMAND_RESULT;
    }

    @Override
    public void handle() {
        System.out.println("Command " + getName() + " Worked");
    }
}
