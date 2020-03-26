package lesson5.geometry;

public class Main {


    public static void main(String[] args) {
        System.out.println(new Vector(new Point(1, 1), new Point(3, 5)));
        for (int i = 0; i < 5; i++) {
            System.out.println(new Vector());
        }
        System.out.println(Vector.vectorCounter);
    }
}
