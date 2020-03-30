package lesson6.ext;

public class B extends A {

    int b;

    public B(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("B" + this);
    }

    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                ", a=" + a +
                '}';
    }
}
