package lesson7;
public class MainClass {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cat = new Cat[28];
        for (int i = 0; i < 28; i++) {
            cat[i] = new Cat("Barsik", (int)(Math.random()*10));
            cat[i].eat(plate);
            System.out.print(i+")");
            cat[i].HungerInfo();
        }
    }

}
