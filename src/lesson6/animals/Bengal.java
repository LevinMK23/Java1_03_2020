package lesson6.animals;

public class Bengal extends Cat {

    public Bengal(String name) {
        super(name);
        //cat this = bengal this
        setColor("Orange");
    }

    @Override
    public void eat() {
        setStamina(getStamina() + 10);
    }
}
