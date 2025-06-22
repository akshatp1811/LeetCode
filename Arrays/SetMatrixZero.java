
    class SetmatrixZero {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRow = false, firstCol = false;

        // Step 1: Check if first row or first column needs to be zeroed
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        // Step 2: Use first row and column to mark zero rows and cols
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 3: Set elements to zero based on first row and col markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Update first row and column if needed
        if (firstRow) {
            for (int j = 0; j < cols; j++) matrix[0][j] = 0;
        }
        if (firstCol) {
            for (int i = 0; i < rows; i++) matrix[i][0] = 0;
        }
    }
}

