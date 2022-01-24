/**
* Java 1 HomeWork 4
*
* @author Irina Khromova
* @version 24.01.2021
*/

import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    
    int SIZE = 3;
    final char CHAR_O = 'o';
    final char CHAR_X = 'x';
    final char CHAR_EMPTY = '.';
    Random random;
    Scanner scanner;
    char[][] table;
    
    public static void main(String[] args) {
        new TicTacToe().game();
    }
    
    TicTacToe() {
        table = new char[SIZE][SIZE];
        random = new Random();
        scanner = new Scanner(System.in);
    }
    
    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (checkWin(CHAR_X)) {
                System.out.println("You Won!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, Draw...");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(CHAR_O)) {
                System.out.println("AI Won!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, Draw...");
                break;
            }
        }
        System.out.println("Game Over");
        printTable();
    }
    
    void initTable() {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                table[x][y] = CHAR_EMPTY;
            }
        }
    }
    
    void printTable() {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }
    
    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1...3]: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = CHAR_X;
    }
    
    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        table[x][y] = CHAR_O;
    }
    
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return table[x][y] == CHAR_EMPTY;
    }
    
    boolean checkWin(char ch) {
        for (int i = 0; i < SIZE; i++) {
            if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) ||
                (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch)){
                return true;
            }
        }
        if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) ||
            (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch)) {
            return true;
        }
        return false;
    }
    
    boolean isTableFull() {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (table[x][y] == CHAR_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
    
    
}
