public class SetElementsAsZero {
    public static void main(String[] args) {
        
        int n = 4, m = 4;
        int[][] arr = {
            {1, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 1}
        };

        int col0 = 1;

        // Step 1: Mark rows and columns
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 0) col0 = 0; // track if first column needs to be zero
            for (int j = 1; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Step 2: Set zeroes based on markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        // Step 3: Set first row
        if (arr[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
            }
        }

        // Step 4: Set first column
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }

        // Print the matrix
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
