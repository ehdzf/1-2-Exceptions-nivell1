package task2.Input;

import task2.exceptions.CustomException;
import task2.utils.TextRenderer;

public class CharInput extends Input {
    public static char readChar(String string) throws CustomException {
        TextRenderer.renderText(string);
        scanner.nextLine();
        String userInput = scanner.nextLine();
        if (userInput.length() != 1) {
            throw new CustomException("please enter a single character");
        }
        return userInput.charAt(0);
    }
}