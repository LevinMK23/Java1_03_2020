package lesson6.animals;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("CHIK CHIRIK");
    }

}
