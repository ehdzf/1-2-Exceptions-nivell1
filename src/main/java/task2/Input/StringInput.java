package task2.Input;

import task2.exceptions.CustomException;
import task2.utils.TextRenderer;

public class StringInput extends Input{
    public static String readString(String message) throws CustomException {
        TextRenderer.renderText(message);
        String userInput = scanner.nextLine();
        if (userInput.equals("null")) {
            throw new CustomException("please enter a valid string");
        }
        return userInput;
    }
}