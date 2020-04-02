package lesson7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InnerClassFabric {

    private int a;

    static public InnerClass1 getInnerClass1Instance(int a) {
        return new InnerClass1(a);
    }

    static public InnerClass2 getInnerClass2Instance(int a) {
        return new InnerClass2(a);
    }

    private static class InnerClass1 {
        int b;

        private InnerClass1(int b) {
            // a = 3;
            this.b = b;
        }
    }

    private static class InnerClass2 {
        int b;

        private InnerClass2(int b) {
            // a = 3;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        // InnerClassFabric outerClass = new InnerClassFabric(1);
        // InnerClassFabric.InnerClass innerClass = outerClass.new InnerClass(2);
        InnerClass1 instance = InnerClassFabric.getInnerClass1Instance(5);

    }

}
