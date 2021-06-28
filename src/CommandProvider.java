import command.*;

import java.util.ArrayList;

public class CommandProvider {

    public ArrayList<Command> getCommandList() {
        ArrayList<Command> command = new ArrayList<>();
        ListCommand listCommand = new ListCommand();
        RenameCommand renameCommand = new RenameCommand();
        ResetCommand resetCommand = new ResetCommand();
        ResultCommand resultCommand = new ResultCommand();
        StartCommand startCommand = new StartCommand();
        command.add(listCommand);
        command.add(renameCommand);
        command.add(resetCommand);
        command.add(resultCommand);
        command.add(startCommand);
        return command;
    }

}

