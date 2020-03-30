package lesson6.interfaces;

import java.io.*;

public class FileLogger implements Logger {

    private String path;
    private File out;
    private PrintWriter printer;

    public FileLogger() {
        path = "log.txt";
        out = new File(path);
        if (!out.exists()) {
            try {
                out.createNewFile();
                printer = new PrintWriter(new FileOutputStream(out, true));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                printer = new PrintWriter(new FileOutputStream(out, true));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

    public FileLogger(String path) {
        this.path = path;
        out = new File(path);
        if (!out.exists()) {
            try {
                out.createNewFile();
                printer = new PrintWriter(new FileOutputStream(out, true));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                printer = new PrintWriter(new FileOutputStream(out, true));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void log(String tag, String message) {
        printer.println(tag + ": " + message);
        printer.flush();
    }
}
