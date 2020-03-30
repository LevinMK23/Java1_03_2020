package lesson6.ext;

public class A {

    int a;

    public A(int a) {
        this.a = a;
        System.out.println("A " + this);
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }
}
