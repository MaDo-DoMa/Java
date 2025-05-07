// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static int[][] clean_board(int[][] board){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                board[i][j] = 0;
            }
        }
        return board;
    }

    public static void show(int[][] board){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        char[] symbols = {'A','B','C','D','E','F','G','H'};
        int[][] board_of_game = new int[8][8];
        clean_board(board_of_game);
        show(board_of_game);
        System.out.println();
        FullBoard.places_on_board(board_of_game);
        show(board_of_game);



    }
}