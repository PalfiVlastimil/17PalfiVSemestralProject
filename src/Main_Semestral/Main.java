package Main_Semestral;

import Christmas.ChristmasPalfiVlastimil;

import java.util.Scanner;

public class Main {
    public static Scanner _sc = new Scanner(System.in);
    public static void main(String[] args) {
        Menu();
    }

    //TODO InputMismatchException: 0+
    public static void Menu(){
        boolean end = false;
        while(!end){
            System.out.println("============================");
            System.out.println("      Semestral Project      ");
            System.out.println("============================");
            System.out.println("1: Run project");
            System.out.println("2: Run previous christmas project");
            System.out.println("3: Exit");

            int choose = _sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println();
                    System.out.println("//=====================\\\\");
                    System.out.println("||     Processing:     ||  ");
                    System.out.println("||  Semestral Project… ||  ");
                    System.out.println("\\\\=====================//");
                    System.out.println();

                    RunSemestralProject();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("//=====================\\\\");
                    System.out.println("||     Processing:     ||  ");
                    System.out.println("|| Christmas1 Project… ||  ");
                    System.out.println("\\\\=====================//");
                    System.out.println();

                    RunChristmasProject();
                    break;
                case 3:
                    end = true;
                    break;
                default:
                    System.out.println();
                    System.out.println("//=====================\\\\");
                    System.out.println("||        ERROR:       ||  ");
                    System.out.println("||    Invalid entry.   ||  ");
                    System.out.println("\\\\=====================//");
                    System.out.println();
                    break;
            }



        }
        String flower =
                "                 ||        \n" +
                "         \\\\      ||      //\n" +
                "           \\\\    ||    //  \n" +
                "             \\\\ ---- //    \n" +
                "          _____|    | _____\n" +
                "          -----|    | -----\n" +
                "             // ---- \\\\  \n" +
                "           //    ||    \\\\ \n"   +
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

    private static void RunSemestralProject() {
        System.out.println("Working");

    }

    private static void RunChristmasProject() {
        ChristmasPalfiVlastimil.RunSnowmanProgram();
        //ChristmasPalfiVlastimil.PrintSnowMan(nSnowballs,nButtons,hatColor,scarfColor);

    }
}



