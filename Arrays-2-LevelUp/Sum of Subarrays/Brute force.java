// problem statement
// Given an array A with N elements , you need to find the sum all sub arrays of array A. 
// //
// Input Format>>
// First line contains size of the array
// Second line contains the elements of the array
// //
// Sample Input >>
// 4
// 5 3 -1 8
// Sample Output>>
// 64

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        printSubSum(arr);
    }

    public static void printSubSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
            }
        }
        System.out.print(sum);
    }

}