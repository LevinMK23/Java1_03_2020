package lesson6.ext;

public class C extends B {

    int c;
    public C(int a, int b, int c) {
        super(a, b);
        this.c = c;
        System.out.println("C" + this);
    }

    @Override
    public String toString() {
        return "C{" +
                "c=" + c +
                ", b=" + b +
                ", a=" + a +
                '}';
    }
}
