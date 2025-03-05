package task2.Input;

import task2.utils.TextRenderer;

public class IntInput extends Input {
    public static int readInt(String string) {
        TextRenderer.renderText(string);
        return scanner.nextInt();
    }
}