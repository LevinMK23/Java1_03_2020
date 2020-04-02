package lesson7;

public class PerformanceTest {

    public static void stringPerformance() {
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += 'a';
        }
    }

    public static void stringBuilderPerformance() {
        StringBuilder s = new StringBuilder();
        s.insert(4, "asfasg");
        s.append("sagasg");
        for (int i = 0; i < 100000; i++) {
            s.append('a');
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        stringPerformance();
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms.");
        start = System.currentTimeMillis();
        stringBuilderPerformance();
        end = System.currentTimeMillis();
        System.out.println(end - start + "ms.");
    }
}
