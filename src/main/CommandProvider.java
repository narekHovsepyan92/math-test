package main;

import main.command.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandProvider {

    public static ArrayList<Command> getCommandList(Scanner scanner) {
        ArrayList<Command> command = new ArrayList<>();
        ListCommand listCommand = new ListCommand();
        RenameCommand renameCommand = new RenameCommand();
        ResetCommand resetCommand = new ResetCommand();
        ResultCommand resultCommand = new ResultCommand();
        StartCommand startCommand = new StartCommand(scanner);
        command.add(listCommand);
        command.add(renameCommand);
        command.add(resetCommand);
        command.add(resultCommand);
        command.add(startCommand);
        return command;
    }

}

