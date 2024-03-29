package Main_Semestral;

import Christmas.ChristmasPalfiVlastimil;

import java.util.InputMismatchException;
import java.util.Scanner;


/** 17. Program vytvoří šachovnici ve tvaru matice při zadání počtu řádků, sloupců, a velikosti bloku.
 * @author Vlastimil Pálfi
 * @version 1.0 12/17/22
 */
public class UI {
    public static Scanner _sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }
    public static void Menu() {
        boolean end = false;
        while (!end) {
            try {
                System.out.println("==========================================");
                System.out.println("||          Semestrální práce           ||");
                System.out.println("==========================================");
                System.out.println("|| 1: Spustit práci                     ||");
                System.out.println("|| 2: Spustit předchozí vánoční projekt ||");
                System.out.println("|| 3: Exit                              ||");
                System.out.println("==========================================");

                int choose = _sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println();
                        System.out.println("//=====================\\\\");
                        System.out.println("||     Processing:     ||  ");
                        System.out.println("||  Semestrální práce… ||  ");
                        System.out.println("\\\\=====================//");
                        System.out.println();

                        runSemesterProject();
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("//=====================\\\\");
                        System.out.println("||     Processing:     ||  ");
                        System.out.println("||   Vánoční projekt…  ||  ");
                        System.out.println("\\\\=====================//");
                        System.out.println();

                        runChristmasProject();
                        break;
                    case 3:
                        end = true;
                        break;
                    default:
                        System.out.println();
                        System.out.println("//=====================\\\\");
                        System.out.println("||        ERROR:       ||  ");
                        System.out.println("||    Neplatný údaj.   ||  ");
                        System.out.println("\\\\=====================//");
                        System.out.println();
                        break;
                }
            } catch (InputMismatchException ex) {
                System.out.println();
                System.out.println("//=====================\\\\");
                System.out.println("||        ERROR:       ||  ");
                System.out.println("||    Neplatný údaj:   ||  ");
                System.out.println("||    (Vložen znak)    ||  ");
                System.out.println("\\\\=====================//");
                System.out.println();
                _sc.nextLine();

            } catch (Exception ex) {
                System.out.println("Zase nějaká divná chybá");
                System.out.println();
                System.out.println("//=====================\\\\");
                System.out.println("||        ERROR:       ||  ");
                System.out.println("||    Neplatný údaj:   ||  ");
                System.out.println("||   (Neznámá chyba)   ||  ");
                System.out.println("\\\\=====================//");
                System.out.println();
                _sc.nextLine();
            }
        }
        String flower =
                          "                 ||\n" +
                        "         \\\\      ||      //\n" +
                        "           \\\\    ||    //  \n" +
                        "             \\\\ ---- //    \n" +
                        "          _____|    | _____\n" +
                        "          -----|    | -----\n" +
                        "             // ---- \\\\  \n" +
                        "           //    ||    \\\\ \n" +
                        "         //      ||      \\\\  \n" +
                        "                 ||        ____ \n" +
                        "                 ||      //    |  \n" +
                        "                 ||    //    // \n" +
                        "                 ||  //   // \n" +
                        "                 ||//  //              Goodbye!\n" +
                        "                 ||=// \n" +
                        "                 ||\n" +
                        " | | | | | # | | || | | | | | | # | | | | | | # | | | | # | | | | |\n" +
                        " | # | # | | | | | # | | | | | # | | | | # | | | | # | | | # | | |\n" +
                        " | | | | | # | | | | | | | # | | | # | | | | | | | | | | | | | | |\n" +
                        " | | | # | | | | # | | # | | | | # | | | | # | | # # | | | # | | |\n";
        System.out.println(flower);
    }

    private static void runSemesterProject() {
        final int  MAX_SIZE = 10000;
        final int  MIN_SIZE = 0;
        try {
            //INPUT
            System.out.println("========================================================================================================");
            System.out.println("|| 17. Program vytvoří šachovnici ve tvaru matice při zadání počtu řádků, sloupců, a velikosti bloku. ||");
            System.out.println("|| Zadané údaje musí být kladná nenulová čísla. Jsou omezeny do 10 000 kvůli jinak přetečení paměti.  ||");
            System.out.println("========================================================================================================");
            System.out.println();
            System.out.println("Zadejte počet řádků.");
            int row = _sc.nextInt();
            if (row <= MIN_SIZE){
                System.out.println("Error: Nastala chyba, zadal jste záporné číslo nebo nulu.");
                return;
            }
            if (row > MAX_SIZE) {
                System.out.println("Error: Nastala chyba, zadal jste větší číslo než 10 000.");
                return;
            }
            System.out.println("Zadejte počet sloupců.");
            int column = _sc.nextInt();
            if (column <= MIN_SIZE) {
                System.out.println("Error: Nastala chyba, zadal jste záporné číslo nebo nulu.");
                return;
            }
            if (column > MAX_SIZE) {
                System.out.println("Error: Nastala chyba, zadal jste větší číslo než 10 000.");
                return;
            }
            System.out.println("Zadejte velikost bloku");
            int blocks = _sc.nextInt();
            if (blocks <= MIN_SIZE) {
                System.out.println("Error: Nastala chyba, zadal jste záporné číslo nebo nulu.");
                return;
            }
            if (blocks > MAX_SIZE) {
                System.out.println("Error: Nastala chyba, zadal jste větší číslo než 10 000.");
                return;
            }
            //OUTPUT
            System.out.println("Výsledná matice");
            int[][] chessboard = Chessboard.createChessboard(row, column, blocks);
            Chessboard.printMatrix(chessboard);
        } catch (InputMismatchException ex) {
            System.out.println("Error: Nastala chyba, zadali jste buď znak či něco, co není kladné číslo.");
            _sc.nextLine();
        } catch (Exception ex) {
            System.out.println("Error: Nastala neznámá chyba…");
            _sc.nextLine();
        }

    }
    //Starý Vánoční projekt
    private static void runChristmasProject() {
        ChristmasPalfiVlastimil.runSnowmanProgram();
    }

}



