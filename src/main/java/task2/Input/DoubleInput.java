package task2.Input;

import task2.utils.TextRenderer;

public class DoubleInput extends Input {
    public static double readDouble(String message) {
        TextRenderer.renderText(message);
        return scanner.nextDouble();
    }
}