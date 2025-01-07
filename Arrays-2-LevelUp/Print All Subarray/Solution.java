// problem statement
// You are given an array of size 'n' and n elements of the same array. You are required to find and print all the subarrays of the given array.
// Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.
// //
// Input Format>>
// The first line contains and integer n
// The second line contains n integer of array  
// //
// Sample Input
// 3
// 10 20 30
// //
// Sample Output
// 10
// 10 20    
// 10 20 30    
// 20
// 20 30    
// 30

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        printSub(arr);
    }

    public static void printSub(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}