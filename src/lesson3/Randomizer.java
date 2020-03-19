package lesson3;

import java.util.Random;

public class Randomizer {
    public static void main(String[] args) {
        System.out.println((int)(Math.random() * 150));
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rnd.nextInt() + " " + rnd.nextGaussian() + " " + rnd.nextInt(100));
        }
    }
}
