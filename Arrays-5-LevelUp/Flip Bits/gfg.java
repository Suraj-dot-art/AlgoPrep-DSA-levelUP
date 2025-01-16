class Solution {

    public static int maxOnes(int arr[], int n) {
        int countOfOne = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = -1;
                countOfOne++;
            }
        }
        // Apply kadans bitch ( max subarray sum )

        int currSum = 0;
        int overSum = Integer.MIN_VALUE;
        ;

        for (int i = 0; i < n; i++) {
            if (currSum >= 0) {
                currSum += arr[i];
            } else {
                currSum = arr[i];
            }
            overSum = Math.max(currSum, overSum);
        }

        if (overSum > 0)
            return countOfOne + overSum;
        else
            return countOfOne;

    }
}