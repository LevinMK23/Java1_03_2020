package lesson6.ext;

public class Test {
    public static void main(String[] args) {
        A a = new C(1,2,3);
        Class<?> c = a.getClass();
        while (true) {
            System.out.println(c.getSimpleName());
            if (c.equals(Object.class)) {
                System.out.println(c.getSuperclass());
                break;
            }
            c = c.getSuperclass();
        }
        System.out.println(a);
    }
}
