package lesson5.animals;

import java.util.Random;

public class Cat {

    public static final String SPEACH = "MEOW";
    private static Random rnd = new Random();
    private String name;
    private CatColor color;
    private int age;

    public Cat(String name) {
        age = 0;
        this.name = name;
        color = CatColor.values()[rnd.nextInt(CatColor.values().length)];
    }

    // Method
    public void run() {
        System.out.println("I'm is running");
    }

    public void say() {
        System.out.println(SPEACH);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", age=" + age +
                '}';
    }
}
