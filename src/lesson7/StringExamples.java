package lesson7;

import java.util.Arrays;

public class StringExamples {
    public static void main(String[] args) {
        String s = "mama       mil;a ramU!!!!";
        // [mama, mila, ramu]
        s = s.toLowerCase()
                .replaceAll("[^a-z ]", "");
        System.out.println(s);
        String [] words = s.split(" +");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString("abc,   cde, efg".split(", +")));
        System.out.println("aaaabcdbcd".indexOf("bcd"));
        System.out.println("aaaabcdbcd".lastIndexOf("bcd"));
        System.out.println("aaaabcdbcd".indexOf("bcde"));
        System.out.println("123@gmail.com".matches("[a-zA-Z0-9]+@{1}[a-zA-Z0-9]+\\.[a-zA-Z0-9]+"));

    }
}
