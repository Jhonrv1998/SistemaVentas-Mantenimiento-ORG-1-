package util;

public class Console {

    // Códigos ANSI para colores
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String YELLOW = "\u001B[33m";
    private static final String CYAN = "\u001B[36m";

    public static void info(String msg) {
        System.out.println(CYAN + "[INFO] " + RESET + msg);
    }

    public static void error(String msg) {
        System.err.println(RED + "[ERROR] " + RESET + msg);
    }

    public static void warning(String msg) {
        System.out.println(YELLOW + "[WARNING] " + RESET + msg);
    }
}

