class Solution {
    public int findJudge(int n, int[][] trust) {

        int[][] matrix = new int[n + 1][n + 1];

        // Build matrix
        for (int i = 0; i < trust.length; i++) {
            int person = trust[i][0];
            int trustedPerson = trust[i][1];

            matrix[person][trustedPerson] = 1;
        }

        // Check every person as possible judge
        for (int judge = 1; judge <= n; judge++) {

            boolean isJudge = true;

            // Judge should trust nobody
            for (int j = 1; j <= n; j++) {
                if (matrix[judge][j] == 1) {
                    isJudge = false;
                    break;
                }
            }

            if (!isJudge) {
                continue;
            }

            // Everyone else should trust judge
            for (int person = 1; person <= n; person++) {
                if (person != judge && matrix[person][judge] != 1) {
                    isJudge = false;
                    break;
                }
            }

            if (isJudge) {
                return judge;
            }
        }

        return -1;
    }
}