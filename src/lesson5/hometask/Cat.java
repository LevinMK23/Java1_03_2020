package lesson5.hometask;

import java.util.ArrayList;

public class Cat {

    enum Sex {
        MAN,
        WOMAN
    }

    private String name;
    private Sex sex;
    // for Adam and Eva mother = null, father = null
    private Cat mother, father;
    private ArrayList<Cat> children;

    public String getName() {
        return name;
    }

    public Cat getMother() {
        return mother;
    }

    public Cat getFather() {
        return father;
    }

    public Sex getSex() {
        return sex;
    }

    public Cat(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
        children = new ArrayList<>();
    }

    public Cat(Sex sex) {
        this.sex = sex;
        children = new ArrayList<>();
    }

    public ArrayList<Cat> getChildren() {
        return children;
    }

    public void makeChild(Cat otherCat) {
        // TODO: 3/26/2020
        /* No man-man, woman-woman
        * */
        // if man trying make child with man kill him )))
    }

    @Override
    public String toString() {
        // TODO: 3/26/2020
        return "Cat{}";
    }
}
