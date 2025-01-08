// Given a N*M 2-D matrix which is sorted row-wise as well as col-wise, the task to find the sum of submatrix having maximum sum.
// Expected Time Complexity: O(N*M), and Solution is not necessarily dp, You will find Dp solution on GFG, you should try to apply something we already learnt.
// //
// Input Format
// The first line contains two integers n and m.
// Each of next n line contains m integers.
// //
// Output Format
// Return the sum of max submatrices out of all.
// //
//   Sample Input 
//   3  3
// -10 -5  3
//  -8  4 10
//   1  6 14
// Sample Output
// 3

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
        int pf[][] = new int[n][m];
        for (int i = 0; i < n; i++) { // row wise prefix
            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    pf[i][j] = arr[i][j];
                } else {
                    pf[i][j] = pf[i][j - 1] + arr[i][j];
                }
            }
        }
        for (int j = 0; j < m; j++) { // col wise prefix
            for (int i = 1; i < n; i++) {
                pf[i][j] = pf[i - 1][j] + pf[i][j];
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int temp = sumRegion(i, j, n - 1, m - 1, pf);
                ans = Math.max(ans, temp);
            }
        }
        System.out.print(ans);
    }

    public static int sumRegion(int r1, int c1, int r2, int c2, int pf[][]) {
        int ans = 0;
        ans = ans + pf[r2][c2];
        if (r1 > 0) {
            ans = ans - pf[r1 - 1][c2];
        }
        if (c1 > 0) {
            ans = ans - pf[r2][c1 - 1];
        }
        if (r1 > 0 && c1 > 0) {
            ans = ans + pf[r1 - 1][c1 - 1];
        }
        return ans;
    }
}