package task1;

public class EmptySaleException extends RuntimeException{
    private static final String MESSAGE = "To make a sell you must first add products";
    public EmptySaleException() {
        super(EmptySaleException.MESSAGE);
    }

    public EmptySaleException(String message) {
        super(message);
    }
}
