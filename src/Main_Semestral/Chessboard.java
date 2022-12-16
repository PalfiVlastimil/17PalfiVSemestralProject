package Main_Semestral;

import java.util.Scanner;

public final class Chessboard {


    // TODO Prepsat metody s malým začínajícím písmenem
    // Testovací main, poté zakomentovat
    public static Scanner _sc = new Scanner(System.in);

    public static void main(String[] args) {
        int row = _sc.nextInt();
        if (row <= 0) {
            System.exit(0); // potom break?
        }
        int column = _sc.nextInt();
        int blocks = _sc.nextInt();

        //System.out.println(block);
        int[][] zerosMatrix = GeneratePart(row, column, blocks);
        PrintMatrix(zerosMatrix);

    }


    public static int[][] GeneratePart(int row, int column, int blocks) {
        int count = 0;
        //ukonči po načtení záporného nebo nulového čísla
        int shift = 0;
        int[][] matrixPart1 = new int[blocks][column];
        for (int i = 0; i < matrixPart1.length; i++) {
            shift = 0;
            for (int j = shift; j < blocks; j++) {
                matrixPart1[i][j] = 0;
                shift = j + 1;

            }
            for (int j = shift; j < blocks + shift; j++) {
                matrixPart1[i][j] = 1;
            }


        }

        int[][] matrixPart2 = new int[blocks][column];
        for (int i = 0; i < matrixPart2.length; i++) {

            for (int j = 0; j < matrixPart2[i].length; j++) {
                matrixPart2[i][j] = (matrixPart1[i][j] == 0) ? 1 : 0;
            }
        }

        System.out.println(shift);
        int[][] chessboard = new int[row][column];

        int nRows = 0;
        while (nRows != row) {
            for (int i = 0; i < matrixPart1.length; i++) {

                for (int j = 0; j < matrixPart1[i].length; j++) {
                    if(nRows >= row){
                        return chessboard;
                    }
                    chessboard[nRows][j] = matrixPart1[i][j];
                    //System.out.print(chessboard[nRows][j] + " ");
                }
                //System.out.println();
                nRows+=1;
            }
            for (int i = 0; i < matrixPart2.length; i++) {

                for (int j = 0; j < matrixPart2[i].length; j++) {
                    if(nRows >= row){
                        return chessboard;
                    }
                    chessboard[nRows][j] = matrixPart2[i][j];
                    //System.out.print(chessboard[nRows][j] + " ");
                }
                //System.out.println();
                nRows+=1;
            }
        }
        return chessboard;

    }

    public static void PrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
