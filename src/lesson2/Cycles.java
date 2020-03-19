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

    public static int[] firstTask(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1) {
                x[i] = 0;
            } else {
                x[i] = 1;
            }
        }
        for (int element : x) {
            System.out.print(element + " ");
        }
        return (x);
    }

    public static int[] SecondTask(int[] x) {
        int adding = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = adding;
            adding += 3;
        }
        for (int element : x) {
            System.out.print(element + " ");
        }
        return (x);
    }

    public static int[] ThirdTask(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 6) {
                x[i] *= 2;
            }
        }
        for (int element : x) {
            System.out.print(element + " ");
        }
        return (x);
    }

    public static int[][] FourthTask(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            x[i][i] = 1;
            x[i][x.length - i - 1] = 1;
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++)
                System.out.print(x[i][j] + " ");
            System.out.println(" ");
        }
        return (x);
    }

    public static void FifthTask(int[] x) {
        int[] minMax = new int[]{x[0], x[0]};
        for (int i = 1; i < x.length; i++) {
            if (x[i] < minMax[0])
                minMax[0] = x[i];
            if (x[i] > minMax[1])
                minMax[1] = x[i];
        }
        System.out.println("Минимальный элемент массива " + minMax[0]);
        System.out.println("Максимальный элемент массива " + minMax[1]);
        return;
    }

    public static boolean SixthTask(int[] x) {
        boolean check = false;
        for (int i = 0; i < x.length; i++) {
            if (check) {
                break;

            }
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j <= i; j++) {
                sum1 += x[j];
            }
            for (int j = i + 1; j < x.length; j++) {
                sum2 += x[j];
            }
            if (sum1 == sum2) {
                System.out.println(sum1);
                System.out.println(sum2);
                check = true;
            }
        }
        return check;
    }
    public static int[] SeventhTask(int[] x, int m){
        for (int i = 0; i < x.length - 1; i++) {
            int y = x[i];
            if(i<m) {
                if (i - m < 0) {
                    x[i] = x[ i - m + x.length];
                    x[ i - m + x.length] = y;
                }
                else{
                    x[i] = x[ i - m ];
                    x[i - m] = y;
                }
            }
            else{
                if ( i - m*2 < 0) {
                    x[i] = x[i - m*2 + x.length];
                    x[i - m*2 + x.length] = y;
                }
                else{
                    x[i] = x[i - m*2];
                    x[i - m*2] = y;
                }
            }
        }
        for (int element : x) {
            System.out.print(element + " ");
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println(Arrays.toString(generateArray(5)));
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
        int[] arrFirst = new int[]{1, 0, 1};
        arrFirst = firstTask(arrFirst);
        System.out.println("");
        int[] arrSecond = new int[8];
        arrSecond = SecondTask(arrSecond);
        System.out.println("");
        int[] arrThird = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrThird = ThirdTask(arrThird);
        System.out.println("");
        System.out.println("Введите длину матрицы");
        int ln = in.nextInt();
        int[][] arrFourth = new int[ln][ln];
        arrFourth = FourthTask(arrFourth);
        System.out.println("");
        int[] arrFifth = arrThird;
        FifthTask(arrFifth);
        System.out.println("");
        int[] arrSixth = arrThird;
        System.out.println(SixthTask(arrSixth));
        System.out.println("");
        System.out.println("Введите а сколько элементов нужно сдвинуть массив");
        int m = in.nextInt();
        int[] arrSeventh = SeventhTask(new int[]{0,1,2,3,4,5,6},m);
    }


}
