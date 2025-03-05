package task2.Input;

import task2.utils.TextRenderer;

public class FloatInput extends Input {
    public static float readFloat(String message) {
        TextRenderer.renderText(message);
        return scanner.nextFloat();
    }
}