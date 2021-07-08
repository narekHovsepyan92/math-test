package main.command;

import main.User;
import main.UserProvider;
import main.data.Constants;
import main.question.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class StartCommand implements Command {

    private final Scanner scanner;

    public StartCommand(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public String getName() {
        return Constants.COMMAND_START;
    }

    @Override
    public void handle() {
        System.out.println("Hello. Enter name");
        String name = scanner.next();
        User user = new User(name);
        UserProvider.setUser(user);
        System.out.println("User name now is " + user.getName());

    }
}
