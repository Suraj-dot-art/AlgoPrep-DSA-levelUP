// problem statment
// Given Array of length n and two integers start and end representing index.
// Print space separated Subarray of the Array from start idx to end idx.

// Input Format->
// The first line contains n representing length of Array
// The second line represents n array elements
// The third line contains 2 integers representing sp and ep.
// Sample Input>>
// 5
// 10 20 30 40 50
// 2 4
// Sample Output>>
// 30 40 50

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int s = scn.nextInt();
        int e = scn.nextInt();

        printSub(arr, s, e);
    }

    public static void printSub(int arr[], int s, int e) {

        for (int i = s; i <= e; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}