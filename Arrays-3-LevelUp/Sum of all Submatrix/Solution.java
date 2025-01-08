public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        sumMat(mat, n, m);
    }

    public static void sumMat(int arr[][], int n, int m) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int TL = (i + 1) * (j + 1);
                int BR = (n - i) * (m - j);
                int occ = TL * BR;
                ans = ans + (occ * arr[i][j]);
            }
        }

        System.out.print(ans);
    }
}