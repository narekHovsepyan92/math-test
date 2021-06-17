package command;

import data.Constants;

public class ResetCommand implements Command{
    @Override
    public String getName() {
        return Constants.COMMAND_RESET;
    }
}
