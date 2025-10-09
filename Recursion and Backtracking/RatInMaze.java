import java.util.*;
public class RatInMaze {
    
    int[][] vis = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };

   void solve(int i, int j, int[][] arr, int n, ArrayList<String> ans, String move, int[][] vis) {
    //Backtracking
    if(i==n-1 && j==n-1)//reached Destination
    {
        ans.add(move); // Corrected this line to add the path
        return;
    }

    //down
    if(i+1<n && vis[i + 1][j] == 0 && arr[i+1][j] == 1){
        vis[i][j] = 1;
        solve(i+1, j, arr, n, ans, move+'D', vis);
        //Backtracking i.e when we return make vis(i,j) = 0
        vis[i][j] = 0;
    }

    //left
    if(j-1>=0 && vis[i][j-1] == 0 && arr[i][j-1] == 1){
        vis[i][j] = 1;
        solve(i, j-1 , arr, n, ans, move+'L', vis);
        //Backtracking i.e when we return make vis(i,j) = 0
        vis[i][j] = 0;
    }

    //right
    if(j+1<n && vis[i][j+1] == 0 && arr[i][j+1] == 1){
        vis[i][j] = 1;
        solve(i, j+1 , arr, n, ans, move+'R', vis);
        //Backtracking i.e when we return make vis(i,j) = 0
        vis[i][j] = 0;
    }

    //up
    if(i-1>=0 && vis[i-1][j] == 0 && arr[i-1][j] == 1){ // Corrected the bounds check here
        vis[i][j] = 1;
        solve(i-1, j , arr, n, ans, move+'U', vis);
        //Backtracking i.e when we return make vis(i,j) = 0
        vis[i][j] = 0;
    }
}

    public static void main(String[] args) {

        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        int n = maze.length;
        ArrayList<String> ans = new ArrayList<>();
        int[][] vis = new int[n][n];
        RatInMaze rat = new RatInMaze();
        rat.solve(0, 0, maze, n, ans, "", vis);
        System.out.println("Possible paths: " + ans);
    }
}