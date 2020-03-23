package lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods {

    static void func(int intValue) {
        System.out.println("int = " + intValue);
    }

    static void func(long longValue) {
        System.out.println("long = " + longValue);
    }

    static void func(float floatValue) {
        System.out.println("float = " + floatValue);
    }

    static void func(double doubleValue) {
        System.out.println("double = " + doubleValue);
    }

    static void func(ArrayList<Integer> data) {
        System.out.println(data);
    }

    static void func(String data) {
        System.out.println(data + ", length = " + data.length());
    }

//    static void func(int a, int b) {
//        System.out.println("TWO PARAM");
//    }

    static void func(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i] + 5;
        }
        System.out.println(sum + 1);
    }

    static void func(Object... objects) {
        for (Object object : objects) {
            if (object.getClass().isArray()) {
                System.out.println("this is array: " + object);
            } else {
                System.out.println(object);
            }
        }
    }

    // signature -> func_name + func_param
    void f(int a) {
    }
    //int f(int a){} no!!!!!

    public static void main(String[] args) {
        //func(1, "2ssddA", new int[]{1, 2, 3}, 4, 5f);
        System.out.println(void.class);
    }

    private static Object genObject() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        return list;
    }

    private static Object genObject1() {
        return "asfasf";
    }
}
