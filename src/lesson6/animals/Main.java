package lesson6.animals;

import lesson6.ext.A;
import lesson6.ext.C;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Name");
        Animal cat1 = new Cat("Name1");
        Animal bengal = new Bengal("Sfinx");
        System.out.println(cat.getColor());
        System.out.println(bengal.getColor());
        A a = new C(1,2,3);
        // cat.getName() = "3";
        // Cat cat2 = new Animal("Oleg");
    }
}
