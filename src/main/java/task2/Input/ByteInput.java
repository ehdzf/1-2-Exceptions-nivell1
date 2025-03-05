package task2.Input;

import task2.utils.TextRenderer;

public class ByteInput extends Input {

    public static byte readByte(String message) {
        TextRenderer.renderText(message);
        return scanner.nextByte();

    }
}