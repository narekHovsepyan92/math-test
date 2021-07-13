package main.command;

import main.AnswersCount;
import main.data.Constants;

public class ResetCommand implements Command {
    @Override
    public String getName() {
        return Constants.COMMAND_RESET;
    }

    @Override
    public void handle() {

        AnswersCount.trueAnswers = 0;
        AnswersCount.wrongAnswers = 0;

        System.out.println("the counter for true answers is reset " + AnswersCount.trueAnswers);
        System.out.println("the counter for wrong answers is reset " + AnswersCount.wrongAnswers);
    }
}
