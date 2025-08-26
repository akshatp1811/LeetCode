class SudokuSolver {
    public static void solveSudoku(char[][] board) {
        solve(board);
    }
    
    static boolean solve(char[][] board) {
        // Traversing throughout the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // if Board is vacant
                if (board[i][j] == '.') {
                    //
                    for (char c = '1'; c <= '9'; c++) {
                        // If in the board at (i,j) keeping c is valid we make a recursion call for the next step.
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (solve(board)) {
                                return true;
                            }
                            // If the next cell is not solvable, that means the solution is incorrect until here, so we backtrack.
                            board[i][j] = '.';
                        }
                    }
                    // If no number from '1' to '9' works for this cell, return false to trigger backtracking
                    return false;
                    // 
                }
            }
        }
        return true;
    }
    
    static boolean isValid(char[][] board, int row, int col, char c) {
        //
        for (int i = 0; i < 9; i++) {
            // Check the current row
            if (board[row][i] == c) {
                return false;
            }
            // Check the current column
            if (board[i][col] == c) {
                return false;
            }
            // Tricky Part: Check the 3x3 sub-grid
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
                return false;
            }
        }
        //
        return true;
    }
    
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        
        solveSudoku(board);
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//----------------------------------------------------MY CODE----------------------------------------------------------------------------
// class SudokuSolver {
//     public static void solveSudoku(char[][] board) {
//         solve(board);
//     }
//     static boolean solve(char[][] board){
//         //Traversing throughout the board
//         for(int i = 0 ; i<board.length ; i++){
//             for(int j = 0 ; j<board.length ; j++){
//                 //if Board is vacant
//                 if(board[i][j] == '.'){
//                     for(char c = '1';c<'9';c++){
//                         //If in the board at (i,j) keeping c is valid the we make a recursion call for the next step.
//                         if(isValid(board,i,j,c)){
                        
//                             board[i][j] = c;
                        
//                         if(solve(board) == true)
//                         {
//                             return true;
//                         }
//                         //If the next cell is nor solvable that means the solution is incorrect until here so we backtrack.
//                         else 
//                         board[i][j] = '.';
//                     }
//                 }
//                     return false;
//                 }
                
//             }
//         }
//         return true;
//     }
//     static boolean isValid(char[][] board , int row , int col , char c)
//     {
//         for(char i = '0';i<='9';i++){
//             if(board[i][col] == c) return false;
//             if(board[row][i] == c) return false;
//             //Tricky Part
//             if(board[3*(row/3) + i/3][3*(col/3)+i%3] == c)
//             return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         char[][] board = {
//             {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//             {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//             {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//             {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//             {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//             {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//             {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//             {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//             {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//         };
//         solveSudoku(board);
//     for (int i = 0; i < board.length; i++) {
//         for (int j = 0; j < board[i].length; j++) {
//             System.out.print(board[i][j] + " ");
//         }
//         System.out.println();
//     }
//     }
// }