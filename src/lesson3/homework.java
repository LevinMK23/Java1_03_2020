package lesson3;

import java.util.Random;
import java.util.Scanner;

public class homework {
    public static void GuessGame() {

        Random rnd = new Random();
        int keepPlaying = 1;
        int answer;
        while (keepPlaying == 1) {
            answer = rnd.nextInt(10);
            System.out.println("Загадано число, попробуйте отгадать");
            Scanner in = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                int userAnswer = in.nextInt();
                if (userAnswer == answer) {
                    System.out.println("Поздравляю, вы угадали");
                    break;
                }
                if (userAnswer > answer) {
                    System.out.println("Ваш ответ был слишком большим");
                }
                if (userAnswer < answer) {
                    System.out.println("Ваш ответ был слишком маленьким");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            keepPlaying = in.nextInt();
        }
    }

    public static void GuessTheWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rnd = new Random();
        String answer;
        answer = words[rnd.nextInt(words.length)];
        System.out.println("Загадано слово, попробуйте отгадать");
        Scanner in = new Scanner(System.in);
        while (true) {
            String userAnswer = in.nextLine();
            if (userAnswer.equalsIgnoreCase(answer)) {
                System.out.println("Поздравляю, вы угадали");
                break;
            } else {
                String wrongGuess = "";
                for (int i = 0; i < 9; i++) {
                    if (i < userAnswer.length() && i < answer.length()) {
                        if (userAnswer.charAt(i) == answer.charAt(i)) {
                            wrongGuess += userAnswer.charAt(i);
                        } else {
                            wrongGuess += "#";
                        }
                    }
                    else{
                        wrongGuess +="#";
                    }

                }
                System.out.println(wrongGuess);
            }
        }
    }

    public static void main(String[] args) {
        GuessTheWord();
        GuessGame();
    }
}
