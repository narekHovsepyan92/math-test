package command;

import data.Constants;

public class RenameCommand implements Command{

    @Override
    public String getName() {
        return Constants.COMMAND_RENAME;
    }
}
