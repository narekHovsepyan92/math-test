package main;

import main.command.Command;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Command> commands = main.CommandProvider.getCommandList(main.ScannerProvider.getScanner());
        main.Presenter presenter = new main.Presenter(commands);
        Scanner scanner = main.ScannerProvider.getScanner();
        System.out.println("Enter main.command");
        String command = scanner.next();
        presenter.onUserCommand(command);
        User user = UserProvider.getUser();
        System.out.println("User name is " + user.getName());

    }
}
