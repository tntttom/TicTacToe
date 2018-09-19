import java.util.Scanner;

public class GameLogic {

    static Scanner scan = new Scanner(System.in);
    private static String spot;
    public static boolean gameOn = true;
    private static int turns = 1;
    private static String player = "x";
    public static Board board;
    public static boolean isPlaying = true;

    public static void welcomeGame() {
     do{
         board.buildLayout();
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player one will be x and player two will be o, Choose a number between 1-9");

        do {
            beginGame();

        } while (gameOn);
        //DONE
        System.out.println("We have a winner");
        System.out.println();
        System.out.println("Would you like to play again?");
        String in = keyboard.nextLine();
        if (in.equalsIgnoreCase("yes")) {
            welcomeGame();
        } else {
            System.out.println("Goodbye!");
            isPlaying = false;
        }
    } while(isPlaying);
    }

    private static void beginGame() {
        //2 Player game
        String input = scan.nextLine();
        selectSpot(input, player);
        checkPlayer();
        checkWin();
        board.separateGrid();
        System.out.println("Player " + player + " choose a spot (1-9)");

        //Check if someone won

    }

    private static void checkPlayer() {
        if (turns % 2 == 0) {
            player = "o";
        } else {
            player = "x";
        }

    }

    // case logic for choosing a spot in the game
    private static void selectSpot(String in, String player) {
        switch(in) {
            default:
                System.out.println("Invalid tile. Please choose a number 1-9");
            case "1":
                spot = board.grid[0][0];
                board.grid[0][0] = player;
                turns++;
                break;
            case "2":
                spot = board.grid[0][1];
                board.grid[0][1] = player;
                turns++;
                break;
            case "3":
                spot = board.grid[0][2];
                board.grid[0][2] = player;
                turns++;
                break;
            case "4":
                spot = board.grid[1][0];
                board.grid[1][0] = player;
                turns++;
                break;
            case "5":
                spot = board.grid[1][1];
                board.grid[1][1] = player;
                turns++;
                break;
            case "6":
                spot = board.grid[1][2];
                board.grid[1][2] = player;
                turns++;
                break;
            case "7":
                spot = board.grid[2][0];
                board.grid[2][0] = player;
                turns++;
                break;
            case "8":
                spot = board.grid[2][1];
                board.grid[2][1] = player;
                turns++;
                break;
            case "9":
                spot = board.grid[2][2];
                board.grid[2][2] = player;
                turns++;
                break;
        }
    }

    //Uses for loop to check if there are 3 Os or Xs in a row
    //DONE found bug where when top 3 cells are filled it does not find winner.
    private static void checkWin() {

        for(int i = 0; i < 2; i++) {
            if(board.grid[i][0].equals( board.grid[i][1]) && board.grid[i][1].equals(board.grid[i][2])){
                gameOn = false;

            } else if (board.grid[0][i].equals(board.grid[1][i]) && board.grid[2][i].equals(board.grid[2][i])) {
                gameOn = false;

            } else if (board.grid[0][0].equals(board.grid[1][1]) && board.grid[0][0].equals(board.grid[2][2])) {
                gameOn = false;

            } else if (board.grid[0][2].equals(board.grid[1][1]) && board.grid[0][2].equals(board.grid[2][0])) {
                gameOn = false;
            } else {
                gameOn = true;
            }
        }


    }
}

