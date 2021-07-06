package main;

import main.command.Command;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Command> commands = CommandProvider.getCommandList(ScannerProvider.getScanner());
        Presenter presenter = new Presenter(commands);
        Scanner scanner = ScannerProvider.getScanner();
        while (true) {
            System.out.println("Enter command");
            String command = scanner.next();
            if (command.equals("finish")){
                break;
            }else {
                try {
                    presenter.onUserCommand(command);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Program finish");
    }
}
