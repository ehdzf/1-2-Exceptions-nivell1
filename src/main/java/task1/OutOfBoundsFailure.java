package task1;

public class OutOfBoundsFailure {
    private static String string = "randmon string";

    public static void main(String[] args) {
        try{
            System.out.println(OutOfBoundsFailure.string.charAt(
                    OutOfBoundsFailure.string.length()
            ));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }
    }
}
