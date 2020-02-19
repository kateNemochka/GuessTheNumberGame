package ua.testing.main;

import java.util.Scanner;

public class Controller implements ViewConstants {
    Scanner sc = new Scanner(System.in);
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        view.printMessage(INSTRUCTIONS);
        view.printRange(model.getRangeMin(), model.getRangeMax());

        userNumberInput();

        view.printMessage(CORRECT_NUMBER);
        view.printAttempts(model.getAttempts());
    }

    public void userNumberInput() {
        int userNumber = -1;
        while (true) {
            view.printMessage(INPUT_REQUEST);
            if (!sc.hasNextInt()) {
                view.printMessage(INCORRECT_INPUT);
                sc.next();
            } else {
                userNumber = sc.nextInt();
                if (model.getRangeMin() <= userNumber
                            && model.getRangeMax() >= userNumber) {
                    if (model.isSecret(userNumber))
                        return;
                    else if (userNumber > model.getSecretNumber())
                        view.printMessage(BIGGER_NUMBER);
                    else if (userNumber < model.getSecretNumber())
                        view.printMessage(SMALLER_NUMBER);
                } else {
                    view.printMessage(OUT_OF_RANGE);
                }
            }
            view.printRange(model.getRangeMin(), model.getRangeMax());
        }
    }
}
