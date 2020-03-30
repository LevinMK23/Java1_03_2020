package lesson6.animals;

public abstract class Animal {

    private String color;
    private String name;
    private int age, stamina;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Animal(String name) {
        // this -> Cat
        this.name = name;
        age = 0;
        stamina = 100;
    }

    public void eat() {
        stamina += 20;
    }

    public void sleep() {
        stamina = 100;
    }

    public abstract void say();

    public void jump() {
        stamina--;
    }
}
