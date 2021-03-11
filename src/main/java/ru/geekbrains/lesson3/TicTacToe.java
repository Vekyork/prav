package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

/**
 * Project jca_02_21
 *
 * @Author Yuriy Vekshin
 * Created 10.03.2021
 * v1.0
 */
public class TicTacToe {
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;

    private static int scoreHuman = 0;
    private static int scoreAi = 0;

    public static void main(String[] args) {

        while (true) {
            initField();
            printField();
            while (true) {
                humanTurn();
                printField();
                if (gameCheck(DOT_HUMAN, "HUMAN wins!!!")) {
                    break;
                }
                aiTurn();
                printField();
                if (gameCheck(DOT_AI, "AI wins!!!")) {
                    break;
                }
            } //%d - int, %f - floating, %s - strings %%
            System.out.printf("SCORE IS: HUMAN  AI\n            %d    %d\n", scoreHuman, scoreAi);
            System.out.println("Wanna play again? >> Y or N");
            if (!SCANNER.next().toLowerCase().equals("y")) break;
        }
    }

    private static boolean gameCheck(char dot, String s) {
        if (checkWin(dot)) {
            if (dot == DOT_HUMAN) scoreHuman++;
            else scoreAi++;
            System.out.println(s);
            return true;
        }
        if (checkDraw()) {
            System.out.println("DRAW!!!");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(x, y)) return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char c) {
//        // hor
//        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
//        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
//        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;
//
//        // ver
//        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
//        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
//        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;
//
//        // dia
//        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
//        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;
        int x = 0;
        int y = 0;
        // hor
        if (field[y][x] == c && field[y][x + 1] == c && field[y][x + 2] == c && field[y][x + 3] == c && field[y][x + 4] == c) return true;
        if (field[y + 1][x] == c && field[y + 1][x + 1] == c && field[y + 1][x + 2] == c && field[y + 1][x + 3] == c && field[y + 1][x + 4] == c) return true;
        if (field[y + 2][x] == c && field[y + 2][x + 1] == c && field[y + 2][x + 2] == c && field[y + 2][x + 3] == c && field[y + 2][x + 4] == c) return true;
        if (field[y + 3][x] == c && field[y + 3][x + 1] == c && field[y + 3][x + 2] == c && field[y + 3][x + 3] == c && field[y + 3][x + 4] == c) return true;
        if (field[y + 4][x] == c && field[y + 4][x + 1] == c && field[y + 4][x + 2] == c && field[y + 4][x + 3] == c && field[y + 4][x + 4] == c) return true;
        // ver
        if (field[y][x] == c && field[y + 1][x] == c && field[y + 2][x] == c && field[y + 3][x] == c && field[y + 4][x] == c) return true;
        if (field[y][x+1] == c && field[y + 1][x+1] == c && field[y + 2][x+1] == c && field[y + 3][x+1] == c && field[y + 4][x+1] == c) return true;
        if (field[y][x+2] == c && field[y + 1][x+2] == c && field[y + 2][x+2] == c && field[y + 3][x+2] == c && field[y + 4][x+2] == c) return true;
        if (field[y][x+3] == c && field[y + 1][x+3] == c && field[y + 2][x+3] == c && field[y + 3][x+3] == c && field[y + 4][x+3] == c) return true;
        if (field[y][x+4] == c && field[y + 1][x+4] == c && field[y + 2][x+4] == c && field[y + 3][x+4] == c && field[y + 4][x+4] == c) return true;
        // dia
        if (field[y][x] == c && field[y + 1][x + 1] == c && field[y + 2][x + 2] == c && field[y + 3][x + 3] == c && field[y + 4][x + 4] == c) return true;
        if (field[y][x+1] == c && field[y + 1][x + 2] == c && field[y + 2][x + 3] == c && field[y + 3][x + 4] == c) return true;
        if (field[y][x+2] == c && field[y + 1][x + 3] == c && field[y + 2][x + 4] == c) return true;
        if (field[y][x+3] == c && field[y + 1][x + 4] == c) return true;
        if (field[y+1][x] == c && field[y + 2][x + 1] == c && field[y + 3][x + 2] == c && field[y + 4][x + 3] == c) return true;
        if (field[y+2][x] == c && field[y + 3][x + 1] == c && field[y + 4][x + 2] == c) return true;
        if (field[y+3][x] == c && field[y + 4][x + 1] == c) return true;
        return false;
    }
//        while (true) {
//            if (field[y][x] == c && field[y][x+1] == c && field[y][x+2] == c);
//            if (field[y+1][x] == c && field[y+1][x+1] == c && field[y+1][x+2] == c);
//            if (field[y+2][x] == c && field[y+2][x+1] == c && field[y+2][x+2] == c);
//        // ver
//            if (field[y][x] == c && field[y+1][x] == c && field[y+2][x] == c);
//            if (field[y][x+1] == c && field[y+1][x+1] == c && field[y+2][x+1] == c);
//            if (field[y][x+2] == c && field[y+1][x+2] == c && field[y+2][x+2] == c);
//        // dia
//            if (field[y][x] == c && field[y+1][x+1] == c && field[y+2][x+2] == c);
//            if (field[y][x+2] == c && field[y+1][x+1] == c && field[y+2][x] == c); {
//                break;
//            }

    private static void aiTurn() {
        int x;
        int y;

        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(x, y));

        field[y][x] = DOT_AI;

    }

    private static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты x и y через пробел >>>>");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y) || !isCellEmpty(x, y));

        field[y][x] = DOT_HUMAN;
    }

    private static boolean isCellValid(int x, int y) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

    private static boolean isCellEmpty(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void initField() {
        fieldSizeY = 5;
        fieldSizeX = 5;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }


    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++)
            System.out.print((i % 2 == 0) ? "-" : i / 2 + 1);
        System.out.println();

        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++)
                System.out.print(field[i][j] + "|");
            System.out.println();
        }

        for (int i = 0; i <= fieldSizeX * 2 + 1; i++)
            System.out.print("-");
        System.out.println();
//        for (int y = 0; y < fieldSizeY; y++) {
//            for (int x = 0; x < fieldSizeX; x++) {
//                System.out.print(field[y][x] + " ");
//            }
//            System.out.println();
//        }
    }
}