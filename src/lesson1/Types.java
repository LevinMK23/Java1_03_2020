package lesson1;

public class Types {
    public static void main(String[] args) {
        // 1) integers
        // 1b = 8bit 2^8 значений 2 ^ (n - 1)
        byte minByteValue = -128, maxByteValue = 127;
        short minShortValue = -32768, maxShortValue = 32767;
        int minIntValue = -2147483648, maxIntValue = 2147483647; // 10 ^ 9
        long minLongValue = (1L << 63), maxLongValue = (1L << 63) - 1; // 10 ^ 18
        // 2) floats
        float floatValue = 1.6f; // точность 8 знаков
        double doubleValue = 1.7; //точность 16 знаков
        System.out.printf("floatValue = %.16f\ndoubleValue = %.16f\n", 1f/3, 1.0/3);
        System.out.println(1/0.);
        System.out.println(0./0);
        System.out.println(Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY);
        // 3) char символьный тип
        char charValue = 'a';
//        for (int i = 0; i < 255; i++) {
//            System.out.print((char) i);
//        }
        // 4) boolean
        boolean booleanValue = false;

    }
}
