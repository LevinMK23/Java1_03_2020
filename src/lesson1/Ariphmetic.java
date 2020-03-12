package lesson1;

public class Ariphmetic {
    public static void main(String[] args) {
        // + - * / %
        // ++ -- += *= /=
        System.out.println(1 / 2);
        System.out.println(1. / 2);
        int a = 1;
        System.out.println(++a);
        System.out.println(a);
        a = a++ + ++a;
        //  2  3    4 6
        a = a-- - --a;
        //  6  5    4  2
        System.out.println(a);
        a *= 3;
        System.out.println(a);
        a /= 2;
        System.out.println((double) a / 2);
    }
}
