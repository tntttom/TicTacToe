

public class Board {

    public static String[][] grid = new String[3][3];
    private static int inc = 1;


    //Building a layout for tic tac toe
    public static void buildLayout() {

        for(int i = 0; i < 3; i++) {
            for(int j = 0;j < 3; j++) {

                grid[i][j] = Integer.toString(inc);
                inc++;
            }
        }

        separateGrid();
    }
    //Print the grid
    public static void separateGrid() {
        System.out.println(grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2]);
        System.out.println(grid[1][0] + "|" + grid[1][1] + "|" + grid[1][2]);
        System.out.println(grid[2][0] + "|" + grid[2][1] + "|" + grid[2][2]);
    }


}
