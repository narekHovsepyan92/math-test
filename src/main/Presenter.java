package main;

import main.command.Command;

import java.util.ArrayList;

public class Presenter {

    private final ArrayList<Command> commands;

    public Presenter(ArrayList<Command> commands) {
        this.commands = commands;
    }

    public void onUserCommand(String command) {
        for(Command c : commands) {
            if (c.getName().equals(command)) {
                c.handle();
                break;
            }
        }
    }
}
