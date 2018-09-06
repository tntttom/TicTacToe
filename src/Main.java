
//Project by Nathan Bullock and Tommy Nguyen

import java.util.Scanner;

public class Main {

    //Variables
    static Scanner scan = new Scanner(System.in);
    public static String[][] grid = new String[3][3];
    public static String spot;
    public static boolean gameOn = true;


    //SEPERATE AS MUCH CODE FROM MAIN TO KEEP IT CLEAN
    public static void main(String args[]){

        buildLayout();
        welcomeGame();
    }




    //Methods Below

    //Building a layout for tic tac toe
    private static void buildLayout() {

        for(int i = 0; i < 3; i++) {
            for(int j = 0;j < 3; j++) {
                grid[i][j] = "x";
            }
        }

        separateGrid();
    }
    //Print the grid
    private static void separateGrid() {
        System.out.println(grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2]);
        System.out.println(grid[1][0] + "|" + grid[1][1] + "|" + grid[1][2]);
        System.out.println(grid[2][0] + "|" + grid[2][1] + "|" + grid[2][2]);
    }


    private static void welcomeGame() {
        System.out.println();
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player one will be X and player two will b O");

        do{
            beginGame();
        } while (gameOn);

    }

    private static void beginGame() {
        //2 Player or Computer?
        System.out.println("Player one choose a spot (top left,middle middle)");
        String input = scan.nextLine();

        selectSpot(input, "one");

        System.out.println(spot);
        separateGrid();

        //Check if someone won

    }

    private static void selectSpot(String in, String player) {

        switch(in) {
            default:
                return;
            case "top left":
                spot = grid[0][0];
                grid[0][0] = "o";
                break;
            case "top middle":
                spot = grid[0][1];
                break;
            case "top right":
                spot = grid[0][2];
                break;
            case "middle left":
                spot = grid[1][0];
                break;
            case "middle middle":
                spot = grid[1][1];
                break;
            case "middle right":
                spot = grid[1][2];
                break;
            case "bottom left":
                spot = grid[2][0];
                break;
            case "bottom middle":
                spot = grid[2][1];
                break;
            case "bottom right":
                spot = grid[2][2];
                break;
        }
    }
}