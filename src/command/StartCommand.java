package command;

import data.Constants;

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
        System.out.println("Name is " + name);
    }
}
