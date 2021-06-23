import command.Command;

import java.util.ArrayList;

public class Presenter {

    ArrayList<Command> commands;

    private Presenter(ArrayList<Command> commands) {
        this.commands = commands;
    }

    private void onUserCommand(String command) {
        System.out.println("User command " + command);
    }
}
