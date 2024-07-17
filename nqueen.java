package Backtracking;

public class nqueen {

    public boolean isSafe(int row, int col, char[][] board){
        //horizontal Check
        for(int j=0;j<board.length; j++){
            if(board[row][j] =='Q'){
                return false;
            }
        }
        //Vertical Check
        for(int j=0; j<board.length;j++){
            if(board[j][col]=='Q'){
                return false;
            }
        }
        //UperCheckLeft
        int r= row;
        for(int c=col; c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //uper right
        int r=row;
        for(int c=col;c<board.length; && r>=0;c++,r--){
            if (board[r][c] == 'Q') {
                return false;   
            }
        }
        //lowerLeft
        int r=row;
        for(int c= col; c && r>=0;)
    }

    public void helper(char[][] board, List<List<String>> allboardboard, int col) {
        if (col == board.length) {
            saveboard(board, allboard);
            return;

        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allboard, col + 1);
                board[row][col] = '.';

            }
        }
    }

    public List<List<String>> solve(int n) {
        List<List<String>> allboard = new ArrayList<>();
        char[][] board = new board[n][n];

    }

}

import java.util.ArrayList;
import java.util.List;

}
