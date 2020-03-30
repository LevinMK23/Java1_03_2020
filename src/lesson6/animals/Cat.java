package lesson6.animals;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        // this -> Bengal
    }

    //ctrl + O
    @Override
    public void say() {
        System.out.println("MEOW");
    }
}
