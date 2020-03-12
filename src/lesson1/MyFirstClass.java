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

    }
}
