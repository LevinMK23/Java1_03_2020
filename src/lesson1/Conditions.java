package lesson1;

public class Conditions {
    public static void main(String[] args) {
        boolean isModifyUI = true;
        boolean isModifyDB = true;
        int valueInUI = 3;
        int valueInDB = 2;
        int newValue = 6;
        if (isModifyUI) {
            System.out.println("Modify valueInUI old = " + valueInUI + " new = " + newValue);
            valueInUI = newValue;
        }
        if (isModifyDB) {
            System.out.println("Modify valueInDB old = " + valueInDB + " new = " + newValue);
            valueInDB = newValue;
        }
        System.out.println(valueInUI);
        System.out.println(valueInDB);

        int a = 4, b = 9, c = 12;
        int x = 0; // input
        if (x <= a) {
            //(-inf; 4]
        } else if (x <= b) {
            // [5; 9]
        } else if (x <= c){
            // [10; 12]
        } else {
            //[13; +inf)
        }
    }
}
