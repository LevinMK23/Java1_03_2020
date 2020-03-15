package homeWorkLesson1;

public class HomeWorkLesson1 {
    public static void main(String[] args) {

        //Объявление и инициализация перменных
        byte typeByte = 127;
        short typeShort = 32767;
        int typeInt = 2147483647;
        long typeLong = 1000000000000000000L;
        float typeFloat = 1.0f;
        double typeDouble = 10.0;
        char typeChar = 'A';
        boolean typeBoolean = true;
        String typeString = "Hello Java";

        //Вызов метода вычисляющего выражение a * (b + (c / d))
        System.out.println("Значение выражения = " + calculateExpression(2.0,4.0,1.0, 2.0));

        //Вызов метода проверяющего диапазон 10 - 20
        System.out.println("Сумма принадлежит [10,20]? " + checkRange(2.0, 8.0));

        //Вызов метода, проверяющего число на +-
        checkPlusMinus(0);

        //Вызов проверки на отрицательность
        System.out.println("Число отрицательное? " + checkMinus(0));

        //Вызов helloName
        helloName("Android");

        //Вызов проверки високосного года
        checkLeapYear(2020);

    }

    //Метод вычисляющий выражение a * (b + (c / d))
    private static double calculateExpression(double a, double b, double c, double d){
        return a * (b + (c / d));
    }

    //метод, принимающий a и b, и проверяющий, что их сумма лежит в пределах от 10 до 20(включительно)
    private static boolean checkRange(double a, double b){
        double sum = a + b;
        return (10<=sum && sum<=20) ? true : false;
    }

    //Метод, проверяющий число на +-
    private static void checkPlusMinus(int a){
        String str = a < 0 ? "отрицательное число " : "положительное число ";
        System.out.println("Передали " + str + a);
    }

    //Проверка на отрицательность
    private static boolean checkMinus(int a){
        return a<0 ? true : false;
    }

    //Hello name!
    private static void helloName(String name){
        System.out.println("Привет, " + name + "!");
    }

    //Проверка високосного года
    private static void checkLeapYear(int year){
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }
}

