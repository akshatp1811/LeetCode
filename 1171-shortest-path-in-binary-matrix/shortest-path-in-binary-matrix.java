class Tuple{
    int first,second,third;
    Tuple(int _first, int _second, int _third){
        first = _first;
        second = _second;
        third = _third;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1){
            return -1;
        }
        int n = grid.length;
        int m = grid[0].length;
        if(n-1 == 0 && m-1 == 0){
            return 1;
        }
        int[] dest = {n,m};
        int dist[][] = new int[n][m];
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m;j++)
                dist[i][j] = Integer.MAX_VALUE;
            }
        dist[0][0] = 1;
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(1,0,0));
        int[] drow = {-1, 1, 0, 0, 1, 1, -1, -1};
        int[] dcol = { 0, 0,-1, 1, 1,-1,  1, -1};
        int _x = 0;
        int _y = 0;
        while(!q.isEmpty()){
            int x = q.peek().second;
            int y = q.peek().third;
            int distance = q.peek().first;
            q.remove();
            for(int i = 0; i < 8;i++){
                _x = x+drow[i];
                _y = y+dcol[i];
                if(_x >= 0 && _y >= 0 && _x<n && _y<m && grid[_x][_y] == 0 && dist[x][y]+1<dist[_x][_y]){
                dist[_x][_y] = dist[x][y] + 1;
                q.add(new Tuple(dist[_x][_y],_x,_y));
                if(_x == n-1 && _y == m-1){
                    return dist[_x][_y];
                }
            }
            }
            
        }
        return -1;
    }
}