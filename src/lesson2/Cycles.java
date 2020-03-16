package lesson2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Cycles {

    public static void printNTimes1(int value, int n) {
        //1. while(condition){action}
        int start = 0;
        while (start <= n) {
            System.out.println("start = " + start +
                    " n = " + n + " start < n = " + (start < n)
                    + " " + value + " ");
            start++;
        }
    }

    public static void printNTimes2(int value, int n) {
        // 2. do{action}while(condition);
        int start = 0;
        do {
            System.out.println("start = " + start +
                    " n = " + n + " start < n = " + (start < n)
                    + " " + value + " ");
            start++;
        } while (start <= n);
        // Cursor cur = db.rawQuery(afasf);
        // cur.moveToNext();
    }

    public static void printNTimes3(int n) {
        // 3. for(init;condition;step)
//        int start=0;
//        while(start < n) {
//            start+=2; start = start + 2
//        }
        for (int start = 1, cnt = 0; cnt < n; start *= 2, cnt++) {
            System.out.println(start + " " + cnt);
        }
        // Cursor cur = db.rawQuery(afasf);
        // cur.moveToNext();
    }

    //((())) printBrackets(3)
    public static void printBrackets(int n) {
        // O(n)
        for (int i = 0; i < n; i++) {
            System.out.print('(');
        }
        for (int i = 0; i < n; i++) {
            System.out.print(')');
        }
    }

    // printBracketsWithLimit(7) ()(())(
    public static void printBracketsWithLimit(int limit) {
        // O(limit)
        boolean isCalc = true;
        int start = 1, countOfPrintedBrackets = 0;
        label:
        while (isCalc) {
            for (int i = 0; i < start; i++) {
                System.out.print('(');
                countOfPrintedBrackets++;
                if (countOfPrintedBrackets >= limit) {
                    isCalc = false;
                    break label;
                }
            }
            for (int i = 0; i < start; i++) {
                System.out.print(')');
                countOfPrintedBrackets++;
                if (countOfPrintedBrackets >= limit) {
                    isCalc = false;
                    break;
                }
            }
            start++;
        }
    }

    public static void printMultipleTable(int n) {
        // O(n ** 2)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3d", i * j); // __1
            }
            System.out.println();
        }
    }

    public static void textFromDigit(int digit) {
        //1 one 2 two 3 three other - other
        switch (digit) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    public static int[] generateArray(int n) {
        return new int[n];
    }

    // ***
    public static void print3Min(int[] array) {
        // 1 2 3 4 5 6 sout(3)
        // O(n**2)
        // O(n)
        Arrays.sort(array);
        System.out.println(array[2]);
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(generateArray(5)));
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int len = in.nextInt();
        System.out.println("Введите " + len + " чисел через пробел");
        int [] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt();
        }
        System.out.print("Вы ввели вот такой массив: \n[ ");
        for(int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("]");
        System.out.println("Четные элементы массива: ");
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("]");
        int sum = 0;
        System.out.print("Сумма элементов массива = ");
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);
    }


}
