package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsoleInput {


    public static void main(String[] args) throws IOException {
        // 1) Scanner smart and usable
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            System.out.println(in.next());
//        }
        // 2) BufferedReader fast!!!!
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );
        // System.out.println(in.readLine());
        // input line of digits
        // regex - регулярные выражения
        String[] words = in.readLine().split(" +");
        System.out.println(Arrays.toString(words));
        Stream.of(words)
                .map(String::toLowerCase)
                .map(element -> element.replaceAll("'{1}[a-z]{1}|[^a-z0-9]{1}", ""))
                .forEach(System.out::println);
        //Stream API
//        List<Integer> digs = Stream.of(in.readLine().split(" "))
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//        System.out.println(digs);
        int[] digits = new int[words.length];
        // int a = (int) "1234" no!!!!
        for (int i = 0; i < words.length; i++) {
            digits[i] = Integer.parseInt(words[i]);
        }
        int sum = 0;
        for (int i : digits) {
            sum += i;
        }
        System.out.println(Arrays.toString(digits));
        System.out.println(sum);
    }
}
