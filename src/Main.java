
import java.util.Scanner;

public class Main {

    //Variables
    Scanner scan = new Scanner(System.in);
    public static String[][] grid = new String[3][3];


    //SEPERATE AS MUCH CODE FROM MAIN TO KEEP IT CLEAN
    public static void main(String args[]){

        buildLayout();
        beginGame();
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


    private static void beginGame() {
        System.out.println();
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player one will be X and player two will b O");

    }
}