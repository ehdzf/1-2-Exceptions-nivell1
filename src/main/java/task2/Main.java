package task2;

import task2.Input.*;
import task2.exceptions.CustomException;
import task2.utils.TextRenderer;

import java.util.InputMismatchException;

public class Main {
    private static String getString() throws CustomException {
        return StringInput.readString("Enter a string: ");
    }

    private static char getChar() throws CustomException {
        return CharInput.readChar("Enter a char: ");
    }

    private static int getInt() {
        return IntInput.readInt("Enter an int: ");
    }

    private static byte getByte() {
        return ByteInput.readByte("Enter a byte: ");
    }

    private static float getFloat() {
        return FloatInput.readFloat("Enter a float: ");
    }

    private static double getDouble() {
        return DoubleInput.readDouble("Enter a double: ");
    }

    private static boolean getBool() throws CustomException {
        return BooleanInput.readBoolean("Enter a boolean (yes/no): ");
    }

    public static void main(String[] args) {

        try {
            TextRenderer.renderText(getByte());
            TextRenderer.renderText(getInt());
            TextRenderer.renderText(getFloat());
            TextRenderer.renderText(getDouble());
            TextRenderer.renderText(getChar());
            TextRenderer.renderText(getString());
            TextRenderer.renderText(getBool());

        } catch (CustomException e) {
            TextRenderer.renderText("Custom exception: " + e.getMessage());
        } catch (InputMismatchException e) {
            TextRenderer.renderText("Input mismatch exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            TextRenderer.renderText("Number format exception: " + e.getMessage());
        }
    }

}
