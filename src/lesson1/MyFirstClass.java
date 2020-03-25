package lesson1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MyFirstClass {
    //psvm
    public static void main(String[] args) throws FileNotFoundException {
        //sout
        String fileName = args[0];
        Scanner in = new Scanner(new File(fileName));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        System.out.println("Hello world");
        byte by = 0;
        short sh = 1;
        int i = 2;
        float f = 2.1f;
        double d = 2.2;
        long l = 3;
        char ch = '4';
        boolean b = false;
        System.out.println(thirdTask(1, 2, 3, 4));
        System.out.println(fourthTask(i, 0));
        System.out.println(fourthTask(i, 10));
        fifthTask(i);
        fifthTask(-1);
        System.out.println(sixthTask(i));
        seventhTask("Фёдор");
        eighthTask(2000);
        eighthTask(2001);
    }
    static double thirdTask(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    static boolean fourthTask(double x, double y) {
        boolean q = false;
        x += y;
        if (x >= 10 && x <= 20)
            q = true;
        return q;
    }

    static void fifthTask(int x) {
        if (x < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    static boolean sixthTask(int x) {
        if (x < 0)
            return true;
        else
            return false;
    }

    static void seventhTask(String str) {
        System.out.println("«Привет, " + str + "!»");
    }

    static void eighthTask(int year) {
        if (year % 4 == 0 &&((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Год високосный");
        }else {
            System.out.println("Год не високосный");
        }
    }
}
