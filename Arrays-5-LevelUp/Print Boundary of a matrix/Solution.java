// Given a square matrix of N*N, print the outer boundary in clockwise direction
// Input Format

// First line contains an integer n representing size of matrix.
// Each of next n lines contain n integer representing array elements.

// Output Format

// Print the outer boundary in clockwise direction in a line with space in between each.

// Sample Input 

// 3
// 1 2 3
// 4 5 6
// 7 8 9

// Sample Output 

// 1 2 3 6 9 8 7 4

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        getBoundary(arr, n);
    }

    public static void getBoundary(int arr[][], int n) {
        int i = 0;
        int j = 0;

        for (int k = 0; k < n - 1; k++) {
            System.out.print(arr[i][j] + " ");
            j++;
        }
        for (int k = 0; k < n - 1; k++) {
            System.out.print(arr[i][j] + " ");
            i++;
        }
        for (int k = 0; k < n - 1; k++) {
            System.out.print(arr[i][j] + " ");
            j--;
        }
        for (int k = 0; k < n - 1; k++) {
            System.out.print(arr[i][j] + " ");
            i--;
        }
    }
}
