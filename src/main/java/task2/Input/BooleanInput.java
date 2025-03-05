package task2.Input;

import task2.exceptions.CustomException;
import task2.utils.TextRenderer;

public class BooleanInput extends Input {
    public static boolean readBoolean(String message) throws CustomException {
        TextRenderer.renderText(message);
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("yes")) {
            return true;
        } else if (userInput.equalsIgnoreCase("no")) {
            return false;
        } else {
            throw new CustomException("please enter \"yes\" or \"no\"");
        }
    }
}