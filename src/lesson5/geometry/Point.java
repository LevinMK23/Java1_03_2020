package lesson5.geometry;

// SOLID
// single response
public class Point {

    double x, y;

    Point(int x, int y) {
        // x - переменная функции
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%f; %f)", x, y);
    }
}
