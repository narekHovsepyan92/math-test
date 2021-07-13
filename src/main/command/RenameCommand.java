package main.command;

import main.User;
import main.UserProvider;
import main.data.Constants;

import java.util.Scanner;

public class RenameCommand implements Command{

    private final Scanner scanner;

    public RenameCommand (Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public String getName() {
        return Constants.COMMAND_RENAME;
    }

    @Override
    public void handle() {
        System.out.println("please reenter user name");
        String name = scanner.next();
        User user = new User(name);
        UserProvider.setUser(user);
        System.out.println("User name changed to " + user.getName());

    }
}
