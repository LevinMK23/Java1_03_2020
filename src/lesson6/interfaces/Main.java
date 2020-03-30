package lesson6.interfaces;

public class Main {
    public static void main(String[] args) {
        Logger log = new FileLogger();
        log.log("test", "message1");
    }
}
