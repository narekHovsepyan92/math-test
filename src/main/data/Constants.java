package main.data;

import java.util.ArrayList;

public class Constants {

    public static final String COMMAND_START = "start";
    public static final String COMMAND_RESET = "reset";
    public static final String COMMAND_RESULT = "result";
    public static final String COMMAND_LIST = "list";
    public static final String COMMAND_RENAME = "rename";

    public static ArrayList<String> getCommandList(){
        ArrayList<String> commands = new ArrayList<>();
        commands.add(COMMAND_START);
        commands.add(COMMAND_RESET);
        commands.add(COMMAND_RESULT);
        commands.add(COMMAND_LIST);
        commands.add(COMMAND_RENAME);
        return commands;
    }

}
