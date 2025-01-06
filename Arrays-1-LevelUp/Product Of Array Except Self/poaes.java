// LEETCODE 238
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        ans[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 1; i--) {
            ans[i] = ans[i - 1] * suffix;
            suffix = suffix * nums[i];
        }

        ans[0] = suffix;

        return ans;
    }
}

// khudka chordke baaki sab
// so [1,2,3,4]
// pre[i] = pre[i-1] * suffix where suffix = suffix * arr[i]
// ex pre[2] = pre[1] * suffix which over here is 4
