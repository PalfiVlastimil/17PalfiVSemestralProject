package Main_Semestral;

import java.util.Scanner;

public final class Chessboard {


    // TODO Prepsat metody s malým začínajícím písmenem
    // Testovací main, poté zakomentovat
    public static Scanner _sc = new Scanner(System.in);
    public static void main(String[] args) {
        int row = _sc.nextInt();
        if(row <= 0){
            System.exit(0); // potom break?
        }
        int column = _sc.nextInt();
        int blocks = _sc.nextInt();

        //System.out.println(block);
        int[][] zerosMatrix = GeneratePlaneBoard(row,column);
        int[][] chessboard = GenerateCheckers(zerosMatrix, blocks);

    }
    public static int[][] GenerateCheckers(int[][] matrix, int blocks){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static int[][] GeneratePlaneBoard(int row, int column){

        //ukonči po načtení záporného nebo nulového čísla
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0; //ternary 0 1
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return  matrix;

    }

}
