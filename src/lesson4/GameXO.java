package lesson4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameXO {

    private final static char EMPTY = '_';
    private final static char DOT_X = 'X';
    private final static char DOT_O = 'O';
    //private static int fieldSize = 3;
    //|_|_|_|
    //|_|_|_|
    //|_|_|_|

    private void printTab(char[][] tab) {
        int counter = 1;
        System.out.print("   ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (char[] chars : tab) {
            System.out.print(counter + " ");
            counter++;
            for (char sym : chars) {
                System.out.print("|" + sym);
            }
            System.out.println("|");
        }
    }

    private void fillTab(char[][] tab) {
        for (char[] chars : tab) {
            Arrays.fill(chars, EMPTY);
        }
    }

    private boolean IsDraw(char[][] tab) {
        boolean draw = true;
        for (int l = 0; l < tab.length; l++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab[l][j] == EMPTY)
                    draw = false;
            }
        }
        return draw;

    }

    public void startGame(int fieldSize) {
        // TODO: 23.03.2020 *** fieldSize > 3, 4(WIN)
        char[][] tab = new char[fieldSize][fieldSize];
        fillTab(tab);
        System.out.println("Игра крестики нолики. Вы играете за Х");
        printTab(tab);
        System.out.println("Для того, чтобы совершить" +
                "" +
                " ход введите номер строки" +
                "и номер столбца таблицы");
        boolean inGame = true;
        Scanner in = new Scanner(System.in);
        while (inGame) {
            System.out.println("Ваш ход:");
            int x, y;
            try {
                x = in.nextInt();
                y = in.nextInt();
                x--;
                y--;
                if (isValid(x, y, tab)) {
                    tab[x][y] = DOT_X;
                    printTab(tab);
                    if (isVictory(tab, DOT_X)) {
                        System.out.println("Вы победили");
                        break;
                    }
                    System.out.print("Компьютер совершает ход");
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(300);
                        System.out.print(".");
                    }
                    System.out.println();
                    movePC(tab);
                    if (isVictory(tab, DOT_O)) {
                        System.out.println("Вы проиграли");
                        break;
                    }
                    // TODO: 23.03.2020 Ничья ???
                    if (IsDraw(tab)) {
                        System.out.println("Ничья");
                        break;
                    }

                } else {
                    System.out.println("Данный ход невозможен! Введите новые значения");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Вы ввели не цифры! Введите цифры");
                in.next();
                continue;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //..... game .....
    }

    private boolean isVictory(char[][] tab, char player /*X, O*/) {
        // TODO: 23.03.2020
        int winningLength = tab.length - 1;
        if (winningLength > 4)
            winningLength = 4;
        for (int x = 0; x < tab[0].length; x++)
            for (int y = 0; y < tab.length; y++)
                if (tab[y][x] == player) {
                    int winStreak;
                    for (int i = 1; i <= winningLength; i++) {
                        if (x - winningLength < 0 || x + winningLength >= tab.length)
                            break;
                        if (player != tab[y][x + i])
                            break;
                        if (i == winningLength)
                            return true;
                    }
                    for (int i = 1; i <= winningLength; i++) {
                        if (x - winningLength < 0 || x - winningLength >= tab.length)
                            break;
                        if (player != tab[y][x - i])
                            break;
                        if (i == winningLength)
                            return true;
                    }

                    for (int i = 1; i <= winningLength; i++) {
                        if (y - winningLength < 0 || y - winningLength >= tab.length)
                            break;
                        if (player != tab[y - i][x])
                            break;
                        if (i == winningLength)
                            return true;
                    }
                    for (int i = 0; i <= winningLength; i++) {
                        if (y + winningLength < 0 || y + winningLength >= tab.length)
                            break;
                        if (player != tab[y + i][x])
                            break;
                        if (i == winningLength)
                            return true;
                    }

                    for (int i = 1; i <= winningLength; i++) {
                        if (y + winningLength < 0 || y + winningLength >= tab.length || x + winningLength < 0 || x + winningLength >= tab.length)
                            break;
                        if (player != tab[y + i][x + i])
                            break;
                        if (i == winningLength)
                            return true;
                    }
                    for (int i = 1; i <= winningLength; i++) {
                        if (y - winningLength < 0 || y - i >= tab.length || x + i < 0 || x + i >= tab.length)
                            break;
                        if (player != tab[y - i][x + i])
                            break;
                        if (i == winningLength)
                            return true;
                    }
                    for (int i = 1; i <= winningLength; i++) {
                        if (y + winningLength < 0 || y + winningLength >= tab.length || x - winningLength < 0 || x - winningLength >= tab.length)
                            break;
                        if (player != tab[y + i][x - i])
                            break;
                        if (i == winningLength)
                            return true;
                    }
                    for (int i = 1; i <= winningLength; i++) {
                        if (y - winningLength < 0 || y - winningLength >= tab.length || x - winningLength < 0 || x - winningLength >= tab.length)
                            break;
                        if (player != tab[y - i][x - i])
                            break;
                        if (i == winningLength)
                            return true;
                    }
                }
        return false;
    }

    private int[] Danger(char[][] tab, char player /*X, O*/) {
        // TODO: 23.03.2020
        int winningLength = tab.length - 1;
        if (winningLength > 4)
            winningLength = 4;
        int[] arr = {-1, -1};
        for (int x = 0; x < tab[0].length; x++)
            for (int y = 0; y < tab.length; y++)
                if (tab[y][x] == player) {
                    int winStreak;
                    for (int i = 1; i <= winningLength - 1; i++) {
                        if (x - winningLength < 0 || x + winningLength >= tab.length)
                            break;
                        if (player != tab[y][x + i])
                            break;
                        if (i == winningLength - 1) {
                            arr[0] = y;
                            arr[1] = x + winningLength;
                            return arr;
                        }
                    }
                    for (int i = 1; i <= winningLength - 1; i++) {
                        if (x - winningLength < 0 || x - winningLength >= tab.length)
                            break;
                        if (player != tab[y][x - i])
                            break;
                        if (i == winningLength - 1) {
                            arr[0] = y;
                            arr[1] = x - winningLength;
                            return arr;
                        }
                    }

                    for (int i = 1; i <= winningLength-1; i++) {
                        if (y - winningLength < 0 || y - winningLength >= tab.length)
                            break;
                        if (player != tab[y - i][x])
                            break;
                        if (i == winningLength-1) {
                            arr[0] = y - winningLength;
                            arr[1] = x;
                            return arr;
                        }
                    }
                    for (int i = 0; i <= winningLength-1; i++) {
                        if (y + winningLength < 0 || y + winningLength >= tab.length)
                            break;
                        if (player != tab[y + i][x])
                            break;
                        if (i == winningLength-1) {
                            arr[0] = y + winningLength;
                            arr[1] = x;
                            return arr;
                        }
                    }

                    for (int i = 1; i <= winningLength-1; i++) {
                        if (y + winningLength < 0 || y + winningLength >= tab.length || x + winningLength < 0 || x + winningLength >= tab.length)
                            break;
                        if (player != tab[y + i][x + i])
                            break;
                        if (i == winningLength-1) {
                            arr[0] = y + winningLength;
                            arr[1] = x + winningLength;
                            return arr;
                        }
                    }
                    for (int i = 1; i <= winningLength-1; i++) {
                        if (y - winningLength < 0 || y - i >= tab.length || x + i < 0 || x + i >= tab.length)
                            break;
                        if (player != tab[y - i][x + i])
                            break;
                        if (i == winningLength-1) {
                            arr[0] = y - winningLength;
                            arr[1] = x + winningLength;
                            return arr;
                        }
                    }
                    for (int i = 1; i <= winningLength-1; i++) {
                        if (y + winningLength < 0 || y + winningLength >= tab.length || x - winningLength < 0 || x - winningLength >= tab.length)
                            break;
                        if (player != tab[y + i][x - i])
                            break;
                        if (i == winningLength-1) {
                            arr[0] = y + winningLength;
                            arr[1] = x - winningLength;
                            return arr;
                        }
                    }
                    for (int i = 1; i <= winningLength-1; i++) {
                        if (y - winningLength < 0 || y - winningLength >= tab.length || x - winningLength < 0 || x - winningLength >= tab.length)
                            break;
                        if (player != tab[y - i][x - i])
                            break;
                        if (i == winningLength-1) {
                            arr[0] = y - winningLength;
                            arr[1] = x - winningLength;
                            return arr;
                        }
                    }
                }
        return arr;
    }

    private void movePC(char[][] tab) {
        // TODO: 23.03.2020 smart strategy
        int len = tab.length;
        int[] dan = Danger(tab,DOT_X);
        int[] arr = {-1,-1};
        if(dan[0]==arr[0]&&dan[1]==arr[1]|| tab[dan[0]][dan[1]] == DOT_O ) {
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (tab[i][j] == EMPTY) {
                        tab[i][j] = DOT_O;
                        printTab(tab);
                        return;
                    }
                }
            }
        }
        else{
            tab[dan[0]][dan[1]] = DOT_O;
            printTab(tab);
            return;
        }
    }

    private boolean isValid(int x, int y, char[][] tab) {
        int len = tab.length;
        if (x >= 0 && x < len && y >= 0 && y < len) {
            if (tab[x][y] == EMPTY) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (args != null && args.length == 1) {
            new GameXO().startGame(Integer.parseInt(args[0]));
        } else {
            new GameXO().startGame(3);
        }

    }
}
