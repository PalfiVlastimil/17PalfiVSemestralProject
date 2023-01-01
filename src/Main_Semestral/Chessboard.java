package Main_Semestral;

import java.util.Scanner;

/** 17. Program vytvoří šachovnici ve tvaru matice při zadání počtu řádků, sloupců, a velikosti bloku.
 * @author Vlastimil Pálfi
 * @version 1.0 12/17/22
 */
public final class Chessboard {


    public static Scanner _sc = new Scanner(System.in);

    /**
     *  Creates chessboard-looking two-dimensional array consisting of ones and zeroes.
     * @param row number of rows
     * @param column number of columns
     * @param blocks square size of each chessboard block (size of n x n)
     * @return Chessboard two-dimensional array.
     */
    public static int[][] createChessboard(int row, int column, int blocks) { // 3. vezmu tyto matice a vytvořím zní šachovnici až do zadané velikosti řádku, pokud začnu přecházet velikost řádku, vráti matici
        int[][] matrixPart1 = generateFirstPart(blocks, column);
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

    /**
     * Creates first part/pattern of a chessboard-like matrix.
     * @param blocks square size of each chessboard block (size of n x n)
     * @param column number of columns
     * @return First pattern of a chessboard matrix.
     */
    private static int[][] generateFirstPart(int blocks, int column) {
        //ukonči po načtení záporného nebo nulového čísla
        int shift = 0;

        int[][] matrixPart1 = new int[blocks][column]; //vytvoří se matice o velikosti bloků a sloupců
        for (int i = 0; i < matrixPart1.length; i++) { //iteruje se přes řádky
            shift = 0;
            for (int j = 0; j < matrixPart1[i].length; j += blocks - 1) { // poté je for loop, který iteruje přes sloupce posunutím
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

    /**
     * Creates second part/pattern of a chessboard-like matrix by inverting ones and zeroes in the first pattern.
     * @param matrixPart1 two-dimensional array to be inverted
     * @return Inverted two-dimensional array.
     */
    private static int[][] generateSecondPart(int[][] matrixPart1) {
        int[][] matrixPart2 = new int[matrixPart1.length][matrixPart1[0].length];
        for (int i = 0; i < matrixPart2.length; i++) {
            for (int j = 0; j < matrixPart2[i].length; j++) {
                matrixPart2[i][j] = (matrixPart1[i][j] == 0) ? 1 : 0;
            }
        }
        return matrixPart2;
    }

    /**
     * Prints two-dimensional array.
     * @param matrix two-dimensional array to be printed
     */
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

