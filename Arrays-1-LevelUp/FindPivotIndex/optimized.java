class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int pre[] = new int[n];
        pre[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pre[i] = nums[i] + pre[i - 1];
        }

        int suff[] = new int[n];
        suff[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            int lsum = (i == 0) ? 0 : pre[i - 1];
            int rsum = (i == n - 1) ? 0 : suff[i + 1];
            if (lsum == rsum) {
                return i;
            }
        }

        return -1;
    }
}