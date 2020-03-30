package lesson6.interfaces;

// SoLid
// Liskov substitution FAIL
// Single response
// Bad example
public class ReadWriter implements Reader, Writer {

    @Override
    public int read() {
        return 0;
    }

    @Override
    public void write(int value) {

    }

    public static void main(String[] args) {
        Writer writer = new ReadWriter();
        Reader reader = new ReadWriter();
    }
}
