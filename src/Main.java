
import java.util.Scanner;

public class Main {

    //Variables

    public static GameLogic game;


    //SEPERATE AS MUCH CODE FROM MAIN TO KEEP IT CLEAN
    public static void main(String args[]) {

        game.board.buildLayout();
        game.welcomeGame();

    }

}

    //Methods Below

