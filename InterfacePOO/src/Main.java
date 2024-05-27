import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger onConsole = new LoggerConsole();
        Logger onFile = new LoggerFile();

        onConsole.log("Debug", Level.DEBUG);
        onConsole.log("Warning", Level.WARNING);
        onConsole.log("Error", Level.ERROR);

        onFile.log("Debug", Level.DEBUG);
        onFile.log("Warning", Level.WARNING);
        onFile.log("Error", Level.ERROR);
    }
}
