class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                // Up
                if(grid[i][j] == 1){
                    if (i == 0 || grid[i - 1][j] == 0) {
                        perimeter++;
                    }

                    // Down
                    if (i == grid.length - 1 || grid[i + 1][j] == 0) {
                        perimeter++;
                    }

                    // Left
                    if (j == 0 || grid[i][j - 1] == 0) {
                        perimeter++;
                    }

                    // Right
                    if (j == grid[i].length - 1 || grid[i][j + 1] == 0) {
                        perimeter++;

                }
                }
            }
            
        }


      return perimeter;  
    }
}