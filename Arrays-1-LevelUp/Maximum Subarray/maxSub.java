//done using KADAN'S ALGORITHM

class Solution {
    public int maxSubArray(int[] nums) {
        // KADAN'S ALGORITHM
        int n = nums.length;
        int sum = 0;
        int Max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (sum >= 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            Max = Math.max(sum, Max);
        }
        return Max;
    }
}
