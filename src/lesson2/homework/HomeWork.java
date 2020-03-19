package lesson2.homework;

import java.util.Arrays;

public class HomeWork {

    // new int[]{5, 2, 7, 3, 1}
    // O(n)
    public static void print3Min(int [] array) {
        int [] m = new int[3];
        for (int i = 0; i < 3; i++) {
            m[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < m[0]) {
                m[2] = m[1];
                m[1] = m[0];
                m[0] = array[i];
            } else {
                if (array[i] < m[1]) {
                    m[2] = m[1];
                    m[1] = array[i];
                } else if (array[i] < m[2]) {
                    m[2] = array[i];
                }
            }
        }
        System.out.println(Arrays.toString(m));
        System.out.println(m[2]);
        //m[0]
    }

    // O(n)
    public static boolean checkBalance(int [] array) {
        int fullSum = 0;
        int pos = -1;
        for (int el : array) {
            fullSum += el;
        }
        if (fullSum % 2 != 0) {
            System.out.println("No solution");
            return false;
        }
        int leftSum = 0;
        String result = "";
        boolean isTrue = false;
        for (int el : array) {
            leftSum += el;
            result += el + " ";
            if (2 * leftSum == fullSum) {
                result += "| ";
                isTrue = true;
                //return true;
            }
        }
        if (isTrue) {
            System.out.println(result);
        } else {
            System.out.println("No solution");
        }
        return isTrue;
    }

    // O(n) = time, O(1) = memory
    // if need return int [] t: O(n) m: O(shift), t: O(n ** 2), m: O(1)
    public static void shiftAndShow(int [] array, int count) {
        int shift = (array.length + count) % array.length;
        for (int i = array.length - shift, cnt = 0; cnt < array.length; i++, cnt++) {
            System.out.print(array[i % array.length] + " ");
        }
    }

    public static void main(String[] args) {
        print3Min(new int[]{5, 2, 7, 3, 1});
    }
}
