package lesson7;

public class Example1 {

    public static void main(String[] args) {

        class A {
            int a;
        }

        class B extends A{

        }

        A a = new B();
        System.out.println(a.getClass());
        // a.a; a принадлежит В!!!
        foo(1L);
        // OOP!!!
        // Stream_API
        // + lambda
        // SQL, NoSQL (Mongo, Firebase)
        // concurrent
    }

    static void foo(Object object) {
        System.out.println(object.getClass());
    }
}
