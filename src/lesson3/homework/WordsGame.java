package lesson3.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordsGame {

    private static String[] words = {"apple", "orange", "lemon", "banana",
            "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
            "melon", "leak", "kiwi", "mango", "mushroom", "nut",
            "olive", "pea", "peanut", "pear", "pepper", "pineapple",
            "pumpkin", "potato"};
    private final Random rnd = new Random();

    public void game() {
        System.out.println("Вам предстоит угадать слово");
        System.out.println("Как вы думаете какое слово я загадал? " +
                "Я буду открывать верные буквы!");
        String word = words[rnd.nextInt(words.length)];
        String random = word;
        word = word + "#".repeat(15 - word.length());
        //System.out.println(random);
        //System.out.println(word);
        char [] sym = word.toCharArray();
        Arrays.fill(sym, '#');
        Scanner in = new Scanner(System.in);
        boolean inGame = true;
        while (inGame) {
            System.out.println("Введите ваше предположение");
            String predict = in.next();
            if (predict.equals(random)) {
                System.out.println("Вы угадали! Я загадал слово: " + predict);
                return;
            }

            for (int i = 0; i < word.length(); i++) {
                if (i < predict.length() && predict.charAt(i) == word.charAt(i)) {
                    if (sym[i] == '#') {
                        sym[i] = word.charAt(i);
                    }
                }
            }
            for(char ch : sym) System.out.print(ch);
            System.out.println();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        if (args != null && args.length == 1) {
            if (args[0].equals("-h") || args[0].equals("-help")) {
                System.out.println("use path to file or use list of param or don't use param");
                return;
            }
            File file = new File(args[0]);
            if (file.exists()) {
                Scanner in = new Scanner(file);
                ArrayList<String> list = new ArrayList<>();
                while (in.hasNext()) {
                    list.add(in.next());
                }
                in.close();
                //System.out.println(list);
                String [] tmp = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    tmp[i] = list.get(i);
                }
                words = tmp;
                System.out.println(Arrays.toString(words));
                new WordsGame().game();
            }
        } else {
            if (args == null || args.length == 0) {
                new WordsGame().game();
            } else {
                words = args;
                new WordsGame().game();
            }
        }
    }
}
