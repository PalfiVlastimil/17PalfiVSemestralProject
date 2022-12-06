package Main_Semestral;

public final class Chessboard {

    // TODO Testovací main, poté zakomentovat
    // TODO Prepsat metody s malým začínajícím písmenem
    public static void main(String[] args) {
        CreateChessboard(6,6);
    }

    public static void CreateChessboard(int radek, int sloupec){

        //ukonči po načtení záporného nebo nulového čísla
        int[][] matrix = new int[radek][sloupec];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] =0;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

}
