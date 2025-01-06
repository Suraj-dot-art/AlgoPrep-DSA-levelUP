//LEETCODE 303

class NumArray {
    int ans[];

    public NumArray(int[] nums) {
        ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i] + ans[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return ans[right];
        }
        return ans[right] - ans[left - 1];
    }
}
