import java.util.Scanner;

public class GameLogic {

    static Scanner scan = new Scanner(System.in);
    private static boolean gameOn = true;
    private static int turns = 1;
    private static String player = "x";
    public static Board board;

    public static void welcomeGame() {
        System.out.println();
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player one will be x and player two will be o, Choose a number between 1-9");

        do{
            beginGame();

//            if(turns >= 6) {
//                checkWin();
//            }
        } while (gameOn);

        System.out.println("We have a winner");

    }

    private static void beginGame() {
        //2 Player or Computer?
        String input = scan.nextLine();
        selectSpot(input, player);
        checkPlayer();
        checkWin();
        board.separateGrid();
        System.out.println("Player " + player + " choose a spot (1-9)");

        //Check if someone won
        checkWin();
    }

    private static void checkPlayer() {
        if (turns % 2 == 0) {
            player = "o";
        } else {
            player = "x";
        }

    }


    private static void selectSpot(String in, String player) {
        switch(in) {
            default:
                System.out.println("Invalid tile. Please choose a number 1-9");
            case "1":
                checkIfTileIsUsed(0,0,player);

                break;
            case "2":
              checkIfTileIsUsed(0,1,player);
                break;
            case "3":
                checkIfTileIsUsed(0,2,player);

                break;
            case "4":
                checkIfTileIsUsed(1,0,player);

                break;
            case "5":
                checkIfTileIsUsed(1 ,1,player);

                break;
            case "6":
                checkIfTileIsUsed(1,2,player);

                break;
            case "7":
                checkIfTileIsUsed(2,0,player);

                break;
            case "8":
                checkIfTileIsUsed(2,1,player);

                break;
            case "9":
                checkIfTileIsUsed(2,2,player);
                break;
        }
    }

    private static void checkIfTileIsUsed(int first, int second, String player) {

        if(board.grid[first][second].equals("x") || board.grid[first][second].equals("o")) {
            System.out.println("This tile is already taken, please choose another");
        } else {
            board.grid[first][second] = player;
            turns++;
        }

    }

    private static void checkWin() {

        for(int i = 0; i < 2; i++) {
            if(board.grid[i][0].equals(board.grid[i][1]) && board.grid[i][1].equals(board.grid[i][2])){
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

