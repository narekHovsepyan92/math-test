package command;

import data.Constants;

public class ListCommand implements Command{
    @Override
    public String getName() {
        return Constants.COMMAND_LIST;
    }
}
