package lesson5.geometry;

public class Vector {

    static int vectorCounter = 0;
    Point a, b; // Fields (Свойства, поля)
    double x, y;
    int id;
    // классовые перемнные

    // constructor
    Vector(Point x, Point y) {
        a = x; b = y;
        vectorCounter++;
        id = vectorCounter;
        this.x = y.x - x.x;
        this.y = y.y - x.y;
    }

    Vector() {
        vectorCounter++;
        id = vectorCounter;
    }

    Vector add(Vector other) {
        return null;
    }

    @Override
    public String toString() {
        return "v" + id + "{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
