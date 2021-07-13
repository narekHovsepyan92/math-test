package main.command;

import main.data.Constants;

import java.util.ArrayList;

public class ListCommand implements Command {
    @Override
    public String getName() {
        return Constants.COMMAND_LIST;
    }

    @Override
    public void handle() {
        ArrayList<String> commands = Constants.getCommandList();
        for (String s : commands) {
            System.out.println(s);
        }
    }
}
