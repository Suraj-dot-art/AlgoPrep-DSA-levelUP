class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Calculate the sum of elements to the left of index i
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // Calculate the sum of elements to the right of index i
            int rightSum = 0;
            for (int j = i + 1; j < n; j++) {
                rightSum += nums[j];
            }

            // Check if the left sum equals the right sum
            if (leftSum == rightSum) {
                return i;
            }
        }

        // Return -1 if no pivot index is found
        return -1;
    }
}
