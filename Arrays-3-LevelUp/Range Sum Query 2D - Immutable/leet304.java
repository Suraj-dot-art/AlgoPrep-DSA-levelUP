//LEETCODE 304
class NumMatrix {
    int[][] pf;

    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        pf = new int[n][m];

        for (int i = 0; i < n; i++) { // row wise prefix sum
            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    pf[i][j] = matrix[i][j];
                } else {
                    pf[i][j] = pf[i][j - 1] + matrix[i][j];
                }
            }
        }

        for (int j = 0; j < m; j++) { // col wise prefix sum
            for (int i = 1; i < n; i++) {
                pf[i][j] = pf[i - 1][j] + pf[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        ans = ans + pf[row2][col2];
        if (row1 > 0) {
            ans = ans - pf[row1 - 1][col2];
        }
        if (col1 > 0) {
            ans = ans - pf[row2][col1 - 1];
        }
        if (row1 > 0 && col1 > 0) {
            ans = ans + pf[row1 - 1][col1 - 1];
        }
        return ans;
    }
}
