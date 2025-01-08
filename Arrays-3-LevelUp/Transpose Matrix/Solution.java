// Write a program to find the transpose of a square matrix of size N*N.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
// Input Format
// First line contains an integer N
// Next N lines contain the matrix with N numbers in each line.
// //
// Output N lines containing the transposed matrix with N numbers in each line.
// //
// Sample Input 
// 4
// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4
// Sample Output 
// 1 2 3 4 
// 1 2 3 4 
// 1 2 3 4 
// 1 2 3 4 

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        transMat(mat, n);
    }

    public static void transMat(int[][] mat, int n) {

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}