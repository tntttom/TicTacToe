
import java.util.Scanner;

public class Main {

    //Variables
    static Scanner scan = new Scanner(System.in);
    public static String[][] grid = new String[3][3];
    public static String spot;
    public static boolean gameOn = true;
    public static int turns = 0;
    public static String player = "x";
    public static int inc = 1;


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

                grid[i][j] = Integer.toString(inc);
                inc++;
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
        System.out.println("Player one will be x and player two will be o, press enter to continue");

        do{
            beginGame();

            if(turns >= 5) {
                checkWin();
            }
        } while (gameOn);

        System.out.println("We have a winner");

    }

    private static void beginGame() {
        //2 Player or Computer?

        String input = scan.nextLine();

        if (turns % 2 == 0) {
            player = "x";
        } else {
            player = "o";
        }
        System.out.println("Player " + player + " choose a spot (1-9)");
        selectSpot(input, player);

        checkWin();
        separateGrid();

        //Check if someone won

    }


    private static void selectSpot(String in, String player) {

        switch(in) {
            default:
                System.out.println("Invalid tile. Please choose a number 1-9");
            case "1":
                spot = grid[0][0];
                grid[0][0] = player;
                turns++;
                break;
            case "2":
                spot = grid[0][1];
                grid[0][1] = player;
                turns++;
                break;
            case "3":
                spot = grid[0][2];
                grid[0][2] = player;
                turns++;
                break;
            case "4":
                spot = grid[1][0];
                grid[1][0] = player;
                turns++;
                break;
            case "5":
                spot = grid[1][1];
                grid[1][1] = player;
                turns++;
                break;
            case "6":
                spot = grid[1][2];
                grid[1][2] = player;
                turns++;
                break;
            case "7":
                spot = grid[2][0];
                grid[2][0] = player;
                turns++;
                break;
            case "8":
                spot = grid[2][1];
                grid[2][1] = player;
                turns++;
                break;
            case "9":
                spot = grid[2][2];
                grid[2][2] = player;
                turns++;
                break;
        }
    }

    private static void checkWin() {

        for(int i = 0; i < 2; i++) {
                if(grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]){
                    gameOn = false;

                } else if (grid[0][i] == grid[1][i] && grid[2][i] == grid[2][i]) {
                    gameOn = false;

                } else if (grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2]) {
                    gameOn = false;

                } else if (grid[0][2] == grid[1][1] && grid[0][2] == grid[2][0]) {
                    gameOn = false;
                } else {
                    gameOn = true;
                }
        }


    }
}