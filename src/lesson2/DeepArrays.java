package lesson2;

public class DeepArrays {

    /*
     ..*..
     .***.
     *****
     .***.
     ..*..
     */
    public static char[][] generateBrilliant(int n) {
        if (n % 2 == 0) {
            throw new RuntimeException("NO NO NO");
        } else {
            char [][] b = new char[n][n];
            int start = n / 2;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    b[i][j] = ' ';
                }
            }
            for (int i = 0; i <= n / 2; i++) {
                for (int j = start - i; j <= start + i; j++) {
                    b[i][j] = '*';
                }
            }
            for (int i = n / 2; i < n; i++) {
                int pos = n - i - 1;
                for (int j = start - pos; j <= start + pos; j++) {
                    b[i][j] = '*';
                }
            }
            return b;
        }
    }

    public static void showTable(char [][] t) {
        for (char [] row : t) {
            for(char element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    // 1 2 3 4 5 -> {2+}
    // 5 1 2 3 4
    // 4 5 1 2 3

    public static void main(String[] args) {
        char [][] bril = generateBrilliant(7);
        showTable(bril);
    }
}
