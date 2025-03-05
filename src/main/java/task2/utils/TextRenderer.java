package task2.utils;


public class TextRenderer {
 private TextRenderer() {
     throw new IllegalStateException("Utility class");
    }


    public static void renderText(String message) {
        System.out.println(message);
    }
    public static void renderText(int message) {
        System.out.println(message);
    }
    public static void renderText(byte message) {
        System.out.println(message);
    }
    public static void renderText(float message) {
        System.out.println(message);
    }
    public static void renderText(double message) {
        System.out.println(message);
    }
    public static void renderText(char message) {
        System.out.println(message);
    }
    public static void renderText(boolean message) {
        System.out.println(message);
    }

}
