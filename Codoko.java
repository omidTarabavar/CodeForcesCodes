import java.util.Scanner;

public class Codoko {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int n = keyboard.nextInt();
        int[][] table = new int[a * b][a * b];
        boolean playerTurn = true;
        for (int t = 0; t < n; t++) {
            if (playerTurn)
                System.out.println("player 1:");
            else
                System.out.println("player 2:");
            boolean check = false;
            int i = keyboard.nextInt();
            int j = keyboard.nextInt();
            int x = keyboard.nextInt();
            check = checkTable(table, i - 1, j - 1, x, a, b);
            if (check) {
                printTable(table);
                playerTurn = !playerTurn;
            } else {
                System.out.println("invalid move");
            }
        }
    }

    static void printTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == 0)
                    System.out.print('.');
                else {
                    System.out.print(table[i][j]);
                }
            }
            System.out.println();
        }
    }

    static boolean checkTable(int[][] table, int row, int col, int x, int a, int b) {
        if (table[row][col] == 0) {
            for (int i = 0; i < table.length; i++) {
                if (table[i][col] == x)
                    return false;
            }
            for (int j = 0; j < table[row].length; j++) {
                if (table[row][j] == x)
                    return false;
            }
            int rowBlock = row % a;
            int whichRow = row / a;
            int colBlock = col % b;
            int whichCol = col / b;
            for (int i = (whichRow * a); i < (whichRow + 1) * a; i++) {
                for (int j = (whichCol * b); j < (whichCol + 1) * b; j++) {
                    if (table[i][j] == x)
                        return false;
                }
            }
            table[row][col] = x;
            return true;
        } else {
            return false;
        }
    }
}
