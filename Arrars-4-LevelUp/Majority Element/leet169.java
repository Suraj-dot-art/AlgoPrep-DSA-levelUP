class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int val = nums[0];
        int freq = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == val) {
                freq++;
            } else {
                if (freq == 0) {
                    val = nums[i];
                    freq++;
                } else {
                    freq--;
                }
            }
        }
        return val;
    }
}
