package lesson1;

public class Functions {

    static void f(int a, boolean flag) {
        //ctrl + alt + l
        // void - пустой, тип который не требует ретерн
        if (!flag) {

        } else {
            System.out.println("OK");
        }
    }

    static int intFunction(int arg1, float arg2) {
        return arg1 + (int) arg2;
    }


    //тип_данных имя_функции(тип_аргумента1 имя, тип_арг2 имя) {
    //     тело_функции
    //}

    public static void Main(String[] args) {
        String hw = "Hello, World!";
        System.out.println(hw);
    }


    public static void main(String[] args) {
        int a = 20;
        String b = "myNumber = ";
        a *= a;
        System.out.println(b + a);
    }

}
