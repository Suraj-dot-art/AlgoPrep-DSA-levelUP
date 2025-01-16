class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = 0;
        int rsteps = n - 1;
        int csteps = m - 1;
        while (csteps >= 1 && rsteps >= 1) {
            for (int k = 0; k < csteps; k++) {
                list.add(matrix[i][j]);
                j++;
            }
            for (int k = 0; k < rsteps; k++) {
                list.add(matrix[i][j]);
                i++;
            }
            for (int k = 0; k < csteps; k++) {
                list.add(matrix[i][j]);
                j--;
            }
            for (int k = 0; k < rsteps; k++) {
                list.add(matrix[i][j]);
                i--;
            }
            i++;
            j++;
            rsteps = rsteps - 2;
            csteps = csteps - 2;

        }
        if (rsteps == 0) {
            for (int k = 0; k <= csteps; k++) {
                list.add(matrix[i][j]);
                j++;
            }
        } else if (csteps == 0) {
            for (int k = 0; k <= rsteps; k++) {
                list.add(matrix[i][j]);
                i++;
            }
        }
        return list;
    }
}
