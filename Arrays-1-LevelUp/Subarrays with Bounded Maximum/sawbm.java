class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = nums.length;

        int preValidCount = 0;
        int ans = 0;
        int lgei = 0; // largest greatest element index
        for (int i = 0; i < n; i++) {
            if (nums[i] > right) {
                lgei = i + 1;
                preValidCount = 0;
            } else if (nums[i] <= right && nums[i] >= left) {
                ans = ans + (i - lgei + 1);
                preValidCount = i - lgei + 1;
            } else {
                ans += preValidCount;
            }
        }

        return ans;
    }
}