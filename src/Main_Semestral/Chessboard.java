package Main_Semestral;

import java.util.Scanner;

public final class Chessboard {

    /** 17. Program vytvoří šachovnici ve tvaru matice při zadání počtu řádků, sloupců, a velikosti bloku.
     * @author Vlastimil Pálfi
     * @version 0.9 12/17/22
     */
    public static Scanner _sc = new Scanner(System.in);
    public static int[][] createChessboard(int row, int column, int blocks) {
        int[][] matrixPart1 = generateFirstPart(column, blocks);
        int[][] matrixPart2 = generateSecondPart(matrixPart1);

        int[][] chessboard = new int[row][column];
        int nRows = 0;
        while (nRows != row) {
            for (int i = 0; i < matrixPart1.length; i++) {
                for (int j = 0; j < matrixPart1[i].length; j++) {
                    if (nRows >= row) {
                        return chessboard;
                    }
                    chessboard[nRows][j] = matrixPart1[i][j];
                }
                nRows += 1; //2
            }
            for (int i = 0; i < matrixPart2.length; i++) {
                for (int j = 0; j < matrixPart2[i].length; j++) {
                    if (nRows >= row) {
                        return chessboard;
                    }
                    chessboard[nRows][j] = matrixPart2[i][j];
                }
                nRows += 1;
            }
        }
        return chessboard;
    }

    private static int[][] generateFirstPart(int column, int blocks) {
        //ukonči po načtení záporného nebo nulového čísla
        int shift = 0;

        int[][] matrixPart1 = new int[blocks][column];
        for (int i = 0; i < matrixPart1.length; i++) {
            shift = 0;
            for (int j = 0; j < matrixPart1[i].length; j += blocks - 1) {
                for (int k = shift; k < blocks + shift; k++) {
                    if (k >= matrixPart1[i].length) {
                        break;
                    }
                    matrixPart1[i][k] = 0;
                }
                shift += blocks;
                for (int k = shift; k < blocks + shift; k++) {
                    //chtěl pří 25 dělat dál, ale nemohl => podmínka
                    if (k >= matrixPart1[i].length) {
                        break;
                    }
                    matrixPart1[i][k] = 1;
                }
                //podmínka, pokud je velikost bloku číslo 1
                if (shift >= matrixPart1[i].length) {
                    break;
                }
                shift += blocks;
            }
        }
        return matrixPart1;
    }

    private static int[][] generateSecondPart(int[][] matrixPart1) {
        int[][] matrixPart2 = new int[matrixPart1.length][matrixPart1[0].length];
        for (int i = 0; i < matrixPart2.length; i++) {
            for (int j = 0; j < matrixPart2[i].length; j++) {
                matrixPart2[i][j] = (matrixPart1[i][j] == 0) ? 1 : 0;
            }
        }
        return matrixPart2;
    }


    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

