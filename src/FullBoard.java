public class FullBoard {
    public static int[][] places_on_board(int[][] board){
        for(int i=0;i<3;i++){
            int symbol = (int)(Math.random() * 6);
            int number = (int)(Math.random() * 6); //we can't but boat in places 6,7 too big
            int place = (int)(Math.random() * 2); //0 if we go up/down, 1 if we put boat on right
            for(int j =0;j<3;j++){
                if(place == 0){
                    board[symbol + j][number] = 1+i;
                }
                else{
                    board[symbol][number + j] = 1 + i;
                }
            }
        }
        return board;
    }
}
