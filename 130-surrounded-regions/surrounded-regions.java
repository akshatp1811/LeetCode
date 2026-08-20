class Pair {
    int i;
    int j;

    public Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Solution {
    public void solve(char[][] board) {

        int n = board.length;
        int m = board[0].length;

        int[][] visited = new int[n][m];
        int[][] isSafe = new int[n][m];

        Queue<Pair> q = new LinkedList<>();

        for (int j = 0; j < m; j++) {

            if (board[0][j] == 'O') {
                q.add(new Pair(0, j));
                visited[0][j] = 1;
                isSafe[0][j] = 1;
            }

            if (board[n - 1][j] == 'O') {
                q.add(new Pair(n - 1, j));
                visited[n - 1][j] = 1;
                isSafe[n - 1][j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {

            if (board[i][0] == 'O') {
                q.add(new Pair(i, 0));
                visited[i][0] = 1;
                isSafe[i][0] = 1;
            }

            if (board[i][m - 1] == 'O') {
                q.add(new Pair(i, m - 1));
                visited[i][m - 1] = 1;
                isSafe[i][m - 1] = 1;
            }
        }

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!q.isEmpty()) {

            int row = q.peek().i;
            int col = q.peek().j;
            q.remove();

            for (int[] dir : directions) {

                int nrow = row + dir[0];
                int ncol = col + dir[1];

                if (nrow >= 0 && nrow < n &&
                    ncol >= 0 && ncol < m &&
                    board[nrow][ncol] == 'O' &&
                    visited[nrow][ncol] == 0) {

                    q.add(new Pair(nrow, ncol));

                    visited[nrow][ncol] = 1;
                    isSafe[nrow][ncol] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (board[i][j] == 'O' && isSafe[i][j] == 0) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}